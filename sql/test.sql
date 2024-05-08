set serveroutput on

create or replace function oddoreven(x in number)
return varchar is
res varchar(5);
begin
if mod(x,2)=0
then
res:='Even';
else
res:='Odd';
end if;
return res;
end oddoreven;
/

begin
dbms_output.put_line(oddoreven(5));
end;
/

