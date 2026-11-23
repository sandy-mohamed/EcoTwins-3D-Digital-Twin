
# 🌍 EcoTwins | Smart Traffic & Emergency Response Digital Twin

### Interactive 3D Front-End & Digital Twin Dashboard

EcoTwins is an academic smart traffic and emergency response digital twin project designed to simulate traffic conditions, visualize congestion, monitor environmental indicators, and demonstrate secure emergency response scenarios.

The broader project combines Data Structures, Algorithms, Cryptography, and interactive visualization to explore safer and more efficient traffic management.

## 👩‍💻 My Contribution

**Sandy Mohamed — Front-End & 3D UI Developer**

I independently designed and developed the entire front-end package in this repository.

My work includes:

- Interactive 3D traffic visualization using Three.js
- Digital twin dashboard and user interface
- User and Admin dashboard experiences
- Traffic scenario visualization and interactions
- Dynamic indicators, charts, and notifications
- Radar and speed violation visualizations
- Arabic and English language switching
- Dark-themed dashboard and UI controls
- JavaScript-based simulation presentation
- JavaFX WebView integration wrapper
- Interface hooks for integration with the team's Java engine

All front-end files included in this repository were developed independently by me.

## 🌐 Live Demo

[🚀 Explore EcoTwins 3D Dashboard](https://sandy-mohamed.github.io/EcoTwins-3D-Digital-Twin/)

## ✨ Front-End Features

### 🚗 Interactive 3D Traffic Environment
- Three-dimensional road and vehicle visualization
- Campus corridor representation
- Camera navigation and scene controls
- Traffic movement and congestion indicators

### 📊 Smart Monitoring Dashboard
- Vehicle speed indicators
- Traffic congestion status
- CO₂ emission indicators
- Radar violation alerts
- Dynamic dashboard statistics
- Interactive charts and notifications

### 🚨 Four Simulation Scenarios
1. Baseline Traffic Conditions
2. Security Attack Simulation
3. Emergency Response at Node B
4. Optimized Traffic Scenario

### 👥 User & Admin Interfaces
- Commuter dashboard
- Admin command dashboard
- Role-specific interface components
- Demonstration login screen

### 🌐 User Experience
- Arabic and English interface
- Light and dark appearance controls
- Interactive navigation and dashboard panels
- Modern glass-style interface elements

## 🛠️ Technologies Used

- HTML5
- CSS3
- JavaScript
- Three.js — 3D rendering and visualization
- Chart.js — Data visualization
- Tailwind CSS — UI styling
- Lucide Icons
- JavaFX WebView — Desktop integration wrapper

## 🏗️ Project Architecture

The complete EcoTwins project is designed around a four-stage processing pipeline:

1. **Ingestion & Encryption**
   - Traffic telemetry and emergency report processing

2. **Security & Data Structures Processing**
   - Data validation, traffic queues, priorities, and routing algorithms

3. **Simulation & Modeling**
   - Traffic modeling, congestion forecasting, and environmental analysis

4. **Authenticated Control & GUI**
   - Secure command presentation and interactive visualization

This repository focuses on the front-end visualization and GUI components of the larger architecture.

## 📁 Repository Structure

```text
EcoTwins-3D-Digital-Twin/
├── index.html
├── ecotwins_3d_hud.html
├── README.md
└── src/
    └── gui/
        └── EcoTwinsHUD.java
```

## 🔗 JavaFX Integration

The JavaFX wrapper embeds the HTML-based dashboard using WebView.

It provides interface methods for integration with the team's Java application:

- `setStage(stageNumber)` — Updates the displayed simulation stage
- `pushCryptoLog(type, message)` — Displays security or algorithm log messages

These methods provide integration points for the broader system.

## 🚀 Getting Started

### Web Preview

1. Clone or download this repository.
2. Open `index.html` in a modern browser.
3. Select a demonstration role.
4. Explore the 3D environment and dashboard features.

### JavaFX Integration

1. Install and configure the JavaFX SDK.
2. Include the GUI wrapper in a JavaFX project.
3. Place `ecotwins_3d_hud.html` in the expected project directory.
4. Run the `gui.EcoTwinsHUD` application with the required JavaFX modules.

## ⚠️ Project Scope

This repository contains the independently developed front-end and 3D GUI demonstration.

The traffic scenarios, security alerts, and displayed measurements are simulated for academic demonstration purposes.

The full Java data structures engine, operational cryptographic modules, and real-world traffic infrastructure integrations are outside the scope of this repository.

The demonstration login screen is not a production authentication system.

## 🎓 Academic Project

**Project:** EcoTwins — Smart Traffic & Emergency Response Digital Twin

**Context:** Delta University academic project

**My responsibility:** Complete Front-End Development and 3D GUI Implementation

## 👩‍💻 Developer

**Sandy Mohamed**

Front-End Developer | Interactive UI & 3D Visualization

[GitHub Profile](https://github.com/sandy-mohamed)
