# EcoTwins Frontend (DS-5 — 3D Digital Twin HUD)

## Contents
- `ecotwins_3d_hud.html`: Complete standalone 3D Digital Twin HUD (Three.js + Chart.js + Tailwind + 4-Step Live Demo).
- `src/gui/EcoTwinsHUD.java`: JavaFX `WebView` wrapper to embed the HUD directly inside the team's Java project (`gui` package) and call `setStage(...)` or `pushCryptoLog(...)` from `ds_engine` / `crypto_layer`.

## Quick Start
1. **Standalone Preview:** Open `ecotwins_3d_hud.html` in any modern browser.
2. **JavaFX Integration:** Place `ecotwins_3d_hud.html` in your project root and run `gui.EcoTwinsHUD` with JavaFX SDK on the module path.
