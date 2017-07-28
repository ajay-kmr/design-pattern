CREATE DATABASE IF NOT EXISTS design_patterns;


USE design_patterns;


CREATE TABLE IF NOT EXISTS project (
  project_id   INTEGER      NOT NULL AUTO_INCREMENT,
  project_name VARCHAR(100) NOT NULL,
  PRIMARY KEY (project_id)
);