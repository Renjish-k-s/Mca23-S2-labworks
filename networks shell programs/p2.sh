res=0
echo "enter the number"
read num
original=$num
while [ $num -gt 0 ]
do
        p=$((num%10))
        res=$((res*10+p))
        num=$((num/10))
done
if [ $original -eq $res ] 
then
	echo "palidrome"
else
	echo "not palindrome"
fi

