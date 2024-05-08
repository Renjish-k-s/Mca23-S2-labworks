fact()
{
    local num=$1
    local res=1

    for((i=1;i<=num;i++))
    do
    res=$(($res*$i))
    done
    echo $res
}

echo enter the number to check
read cnum
temp=$cnum
sum=0
while [ $cnum -gt 0 ]
do
p=$(($cnum%10))
f=$(fact $p)
sum=$(($sum+$f))
cnum=$(($cnum/10))
done

echo $sum
