-- Create the tables
CREATE TABLE tasks(
    ID SERIAL PRIMARY KEY NOT NULL,
    name VARCHAR(500) NOT NULL,
    completed BOOLEAN NOT NULL DEFAULT false
);