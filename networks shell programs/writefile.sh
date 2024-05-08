echo enter the no of lines to be concatnated
read limit
i=0;

while [ $i -lt $limit ]
do
echo enter the line $(($i+1))
read line
echo "$line" >> text.txt
i=$(($i+1))
done