set serveroutput on
declare
i number(4);
begin
for i in reverse 0..4 
loop
dbms_output.put_line('hello'||i);
end loop;
end;
/