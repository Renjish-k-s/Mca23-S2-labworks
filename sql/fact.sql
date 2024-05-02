set serveroutput on
declare
num number(3);
i number(2);
fact number(3) := 1;
begin
num := &num;
for i in 1..num
loop
fact := fact *i;
end loop;
dbms_output.put_line(fact);
end;
/ 