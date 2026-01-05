# Chirp – Kotlin Multiplatform Learning Project  
### Building Industry-Grade Compose Multiplatform Apps for Android & iOS

Chirp is a **Kotlin Multiplatform (KMP)** real-time messaging application targeting **Android and iOS**, built using **Compose Multiplatform**.

This repository is a **course-based learning project** developed as part of the class  
**“Building Industry-Grade Compose Multiplatform Apps for Android & iOS”**.

The primary goal of this project is to **study and understand how industry-grade mobile applications are built**, particularly in a **cross-platform Kotlin Multiplatform environment**.

---

## Important Notice

> The implementation in this repository closely follows the original course material and reference implementation.  
> This project is used strictly for **learning, exploration, and portfolio demonstration purposes**, to showcase understanding of architecture, tooling, and cross-platform development concepts.

---

## Project Objectives

This project is intended to demonstrate:

- Hands-on experience with **Kotlin Multiplatform (KMP)**
- Understanding of **Compose Multiplatform** for shared UI
- Familiarity with **Clean Architecture** in a real-world codebase
- Experience working with **multi-module projects**
- Ability to navigate, build, and run complex mobile applications

---

## Supported Platforms

- Android (Compose Multiplatform)
- iOS (Compose Multiplatform with Swift entry point)
- Desktop (JVM) – *not yet implemented in this repository*

---

## Architecture Overview

The project follows **Clean Architecture principles**, with clear separation between:

- **Presentation Layer**  
  Compose Multiplatform UI and state-driven state management

- **Domain Layer**  
  Business logic and use cases shared across platforms

- **Data Layer**  
  Networking, persistence, and platform-specific integrations

This structure promotes scalability, maintainability, and testability.

---

## Features Covered

- User authentication (JWT-based)
- Real-time messaging using WebSocket
- Shared business logic across Android and iOS
- Push notifications using Firebase (Android)
- Local persistence using Room (Android)
- Platform-specific integrations for mobile platforms

---

## Technology Stack

- Kotlin Multiplatform
- Compose Multiplatform
- Kotlin Coroutines & Flow
- Clean Architecture
- WebSocket
- Firebase (Android)
- Room Database (Android)

## How This Repository Is Used in My Portfolio

This repository is included in my portfolio to:

- Demonstrate exposure to industry-grade mobile architecture
- Show familiarity with Kotlin Multiplatform projects
- Provide a concrete reference for technical discussions during interviews
- Future improvements and personal customizations may be added incrementally.

## Planned Improvements

- Desktop (JVM) support
- Additional error handling and logging
- Minor refactoring for improved readability
- Custom feature experiments beyond the course scope

## Course Reference

This project follows the course material and reference implementation by Philip Plackner.

Original reference repository:
https://github.com/philipplackner/Chirp

## Disclaimer

This project is intended for educational and demonstration purposes only.
All original concepts and architecture belong to the course author.
