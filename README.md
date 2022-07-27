# MTD-Learning

A demo project using Java and Springboot for the study of languages/techs in the MTD space.

Getting Started:
- Clone the repo
- Navigate to the root directory and run the command 'docker build --tag=mtd-learning:latest .'
- Start the application in the same directory with 'docker-compose -f docker-compose.yml up'

Currect endpoints you can test:
- GET - returns all 'foo'
  URL = localhost:8080/foo
  
- GET - returns the first 'foo' with a given name
  URL = localhost:8080/foo/{name}
  
- POST - add your own 'foo' to the collection
  URL = localhost:8080/foo
  Request Body =
  {
    "name": "dragon",
    "legs": 2,
    "canFly": true
  }

