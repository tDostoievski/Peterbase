# Production Control System

This is a desktop application for monitoring and managing the pigment dispersion and milling process in an industrial setting. It aims to improve batch reproducibility and parameter tracking by providing a structured interface for data entry, visualization, and comparison against predefined standards.

## Features

- **Product Registration**: Register ideal processing parameters for each product, including dispersion speed, time, temperature, and target viscosity.
- **Batch Tracking**: Record real-world production values per batch, including associated pigments, mills, and revisions.
- **User Interface**: JavaFX-based front-end with dynamic scene loading and integrated CSS styling.
- **Data Persistence**: Uses Spring Boot with JPA for database operations, backed by SQLite or H2.
- **FXML Templates**: Modular screen components for clean interface navigation and user experience.
- **Embedded Parameters**: Custom parameter classes like `ParametrosDispersao` and `Data` are embedded directly into the batch records for normalization and clarity.

## Technology Stack

- **Java 17**
- **JavaFX 17**
- **Spring Boot 3.4.4**
- **SQLite & H2 Database**
- **Maven**
- **FXML + CSS**

## Key Entities

- `Products`: Abstract base for product information.
- `Lotes`: Represents a production batch and inherits from `Products`.
- `Pigmento`: Stores pigment lot information.
- `Moinho`: Milling equipment with specific configuration data.
- `ParametrosDispersao`: Embedded class to hold dispersion process settings.
- `Data`: Embedded date class for batch tracking.

## Project Structure

