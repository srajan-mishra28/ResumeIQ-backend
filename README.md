ResumeIQ Backend 🚀

AI-powered resume analysis backend built with Spring Boot.

ResumeIQ analyzes resumes against job descriptions and returns:

Match score
Missing skills
Strength areas
AI-powered recommendations (coming soon)
🌐 Live Demo
https://your-render-url.onrender.com
⚙️ Tech Stack
Java 21
Spring Boot
Maven
Docker
Render
Codex
REST APIs
✨ Features
Current Features
Resume upload API
Multipart file handling
Job description input
Structured JSON response
Dockerized deployment
Cloud-hosted backend
Planned Features
PDF text extraction
AI resume analysis
ATS score generation
Skill gap analysis
Interview preparation suggestions
OpenAI / LLM integration
📦 API Endpoint
Analyze Resume
POST /api/resume/analyze
Request Type
multipart/form-data
Request Params
Key	Type
resume	File
jobDescription	Text
📄 Sample Response
{
  "matchScore": 82,
  "missingSkills": [
    "Docker",
    "Kubernetes"
  ],
  "strengths": [
    "Spring Boot",
    "React",
    "AWS"
  ],
  "summary": "Strong backend profile with good frontend exposure."
}
🐳 Run Locally
Clone Repository
git clone https://github.com/srajan-mishra28/ResumeIQ-backend.git
Start Application
./mvnw spring-boot:run

Windows:

.\mvnw.cmd spring-boot:run
🐳 Docker Support
Build Docker Image
docker build -t resumeiq-backend .
Run Container
docker run -p 8080:8080 resumeiq-backend
🏗️ Architecture
Client
   ↓
Spring Boot REST API
   ↓
Resume Processing Layer
   ↓
AI Analysis Engine (Upcoming)
📌 Project Goal

ResumeIQ aims to simplify resume evaluation and help developers/job seekers understand:

skill gaps
ATS compatibility
interview preparation areas
job alignment

using AI-assisted workflows.

👨‍💻 Author

Built by Srajan Mishra.
