set serveroutput on

create or replace procedure squarepro(x in out number)is
begin
x:=x*x;
end;
/

declare
x number;
begin
x:=&x;
squarepro(x);
dbms_output.put_line(x);
end;
/

show error procedure squarepro;
