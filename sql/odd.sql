set serveroutput on
declare
num number(3);
begin

num := &num;
if ((num mod 2)=0) then
    dbms_output.put_line('even');
else
    dbms_output.put_line('odd');
end if;
end;
/