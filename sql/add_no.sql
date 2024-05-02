set serveroutput on

create or replace function addnumbers(f in number,s in number)
return number is
total number;
begin 
total:=f+s;
return total;
end addnumbers;
/

declare
f number;
s number;
total number;
begin
f:=4;
s:=4;
total:=addnumbers(f,s);
dbms_output.put_line('SUM='||total);
end;
/


