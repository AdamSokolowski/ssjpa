CREATE TABLE IF NOT EXISTS account(
  id serial NOT NULL PRIMARY KEY,
  user_name VARCHAR(255) UNIQUE NOT NULL,
  password VARCHAR(255),
  active BOOLEAN,
  is_admin BOOLEAN,
  expired BOOLEAN,
  locked BOOLEAN,
  enabled BOOLEAN
  );