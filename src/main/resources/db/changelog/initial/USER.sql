CREATE TABLE IF NOT EXISTS user(
  id BIGINT AUTO_INCREMENT PRIMARY KEY,
  user_name VARCHAR(255) UNIQUE NOT NULL,
  password VARCHAR(255),
  active BOOLEAN,
  is_admin BOOLEAN,
  expired BOOLEAN,
  locked BOOLEAN,
  enabled BOOLEAN
  );

INSERT INTO user (user_name, password, active, is_admin, expired, locked, enabled) VALUES(
  'admin', 'pass', true, true, false, false, true
);
INSERT INTO user (user_name, password, active, is_admin, expired, locked, enabled) VALUES(
  'user', 'pass', true, false, false, false, true
);