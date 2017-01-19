SHOW DATABASES;
CREATE DATABASE customer;
USE customer;
DROP TABLE IF EXISTS user;
CREATE TABLE user (
  id         INT AUTO_INCREMENT PRIMARY KEY,
  username   VARCHAR(40),
  password   VARCHAR(40),
  product_id INT
);

DROP TABLE IF EXISTS product;
CREATE TABLE product (
  pid   INT AUTO_INCREMENT PRIMARY KEY,
  brand VARCHAR(255),
  price VARCHAR(255)
);
DROP TABLE IF EXISTS book;
CREATE TABLE book (
  bid        INT AUTO_INCREMENT PRIMARY KEY,
  bookname   VARCHAR(40),
  bookauthor VARCHAR(40),
  userId     INT
);
INSERT INTO book (bookname, bookauthor, userId) VALUES ('java', 'usa', 1);
INSERT INTO book (bookname, bookauthor, userId) VALUES ('web', 'chn', 1);
INSERT INTO book (bookname, bookauthor, userId) VALUES ('html', 'jpn', 2);

SELECT *
FROM user
  LEFT JOIN book ON user.id = book.userId
WHERE id = 2;
# ================================触发器案例====================================
DROP TABLE IF EXISTS tab1;
CREATE TABLE tab1(
  tab1name VARCHAR(11),
  tab1pwd VARCHAR(11)
);
DROP TABLE IF EXISTS tab2;
CREATE TABLE tab2(
  hobby VARCHAR(40),
  home VARCHAR(40)
);
DROP TABLE IF EXISTS taball;
CREATE TABLE taball(
  name VARCHAR(11),
  pwd VARCHAR(11),
  hobby VARCHAR(40),
  home VARCHAR(40)
);
    -- 关联自动添加数据
DROP TRIGGER IF EXISTS t_afterinsert_on_tab1;
CREATE TRIGGER t_afterinsert_on_tab1
  AFTER INSERT ON tab1
  FOR EACH ROW
  BEGIN
    INSERT INTO taball (name, pwd) VALUES (new.tab1name,new.tab1pwd);
  END;
CREATE TRIGGER t_afterinsert_on_tab2
  AFTER INSERT ON tab2
  FOR EACH ROW
  BEGIN
   UPDATE taball SET hobby=new.hobby,home=new.home ;
  END;
SELECT *FROM tab1;
SELECT * FROM tab2;
SELECT *
FROM taball;
INSERT INTO tab1 (tab1name, tab1pwd) VALUES ('wanghua','11111');
INSERT INTO tab2 (hobby, home) VALUES ('swimming','xi.an');

  -- 管理自动删除数据
/*DROP TRIGGER IF EXISTS a;
CREATE TRIGGER a
 AFTER DELETE ON tab1
  FOR EACH ROW
  BEGIN
    DELETE FROM tab2 WHERE tab2.tab2name=old.tab1name;
  END;*/


