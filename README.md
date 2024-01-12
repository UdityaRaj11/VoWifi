# Intranet Video Streaming Project

## Overview

The Intranet Video Streaming project is a real-time video transmission system designed for local network environments. Leveraging Java, OpenCV, and socket programming, this project captures video frames on the server, encodes them, and transmits the data to the client, where it is decoded and displayed in real-time.

## Features

- **Efficient Video Transmission:** Utilizes OpenCV for optimal video processing, encoding, and decoding.
- **Continuous Streaming:** Ensures uninterrupted video streaming for a seamless user experience.
- **Client-Server Architecture:** Implements a robust client-server architecture for efficient communication.
- **Scalability:** Designed with future scalability in mind, supporting potential extensions for multiple clients.
- **Security Measures:** Incorporates basic security measures with the potential for user authentication and encryption in future versions.

## Getting Started

### Prerequisites

- [Java](https://www.java.com/) installed
- [OpenCV](https://opencv.org/) configured and integrated into the project
- IDE with Java support (e.g., [Eclipse](https://www.eclipse.org/) or [IntelliJ IDEA](https://www.jetbrains.com/idea/))

### Installation

1. Clone the repository: `git clone https://github.com/UdityaRaj11/VoWifi.git`
2. Configure OpenCV in the project.
3. Open the project in your preferred IDE.
4. Run the server-side code on the server machine.
5. Run the client-side code on the client machine.

## Usage

- Start the server before the client to initiate the video streaming process.
- The client will continuously receive and display the streamed video frames in real-time.

## Future Enhancements

- Implement user authentication for secure access.
- Introduce encryption mechanisms for data confidentiality.
- Enhance error resilience for improved system reliability.
- Add user controls and dynamic video quality adjustments.

## Contributing

Contributions are welcome! Please follow the [Contribution Guidelines](CONTRIBUTING.md).

## License

This project is licensed under the [Apache License](LICENSE).

## Acknowledgments

- [OpenCV Community](https://opencv.org/community/)
- [Java Community](https://www.java.com/)
- [Socket Programming in Java](https://www.geeksforgeeks.org/socket-programming-in-java/)
