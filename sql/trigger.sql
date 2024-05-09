set SERVEROUTPUT ON

-- CREATE TABLE cust(id int,fname VARCHAR(20),salary NUMBER(20));

create or REPLACE TRIGGER display_sal 
before INSERT or UPDATE or DELETE on cust
for each ROW
DECLARE
sal_def number;
BEGIN
sal_def:=:new.salary - :old.salary;
dbms_output.put_line('new salary'||:new.salary);
dbms_output.put_line('old salary'||:old.salary);
dbms_output.put_line(sal_def);
end;
/
