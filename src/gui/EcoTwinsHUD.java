package gui;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

import java.io.File;

/**
 * EcoTwins Frontend HUD Wrapper (DS-5)
 * Embeds the 3D WebGL Digital Twin HUD inside JavaFX WebView
 * and exposes helper methods for ds_engine, simulation, and crypto_layer.
 */
public class EcoTwinsHUD extends Application {

    private static WebEngine engine;

    @Override
    public void start(Stage primaryStage) {
        WebView webView = new WebView();
        engine = webView.getEngine();
        engine.setJavaScriptEnabled(true);

        File htmlFile = new File("ecotwins_3d_hud.html");
        engine.load(htmlFile.toURI().toString());

        Scene scene = new Scene(webView, 1366, 768);
        primaryStage.setTitle("EcoTwins — 3D Smart Traffic & Secure Digital Twin HUD");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /** Switch Live Demo stage (1 = Baseline, 2 = Attack Sim, 3 = Emergency @ B, 4 = Optimized) */
    public static void setStage(int stageNumber) {
        if (engine == null) return;
        Platform.runLater(() -> engine.executeScript("applyStage(" + stageNumber + ");"));
    }

    /** Push a live security/algorithm log entry from Java CryptoLayer or DSEngine */
    public static void pushCryptoLog(String type, String message) {
        if (engine == null) return;
        String safeMsg = message.replace("'", "\\'");
        Platform.runLater(() -> engine.executeScript("pushLog('" + type + "', '" + safeMsg + "');"));
    }

    public static void main(String[] args) {
        launch(args);
    }
}
