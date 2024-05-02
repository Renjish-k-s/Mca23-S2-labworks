set serveroutput on

create or replace function findmax(x in number,y in number)
return number is
z number;
begin
if x>y then
	z:=x;
else
    z:=y;
end if;
return z;
end findmax;
/


declare
	a number;
	b number;
	c number;
begin
	a:=12;
	b:=14;
	c:=findmax(a,b);
	dbms_output.put_line('MAXIMUM  NUMBER=	'||c);
end;
/
