set serveroutput on
declare
message varchar(20) := 'hello world!!';
begin
dbms_output.put_line(message);
end;
/
