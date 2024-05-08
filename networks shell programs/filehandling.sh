echo enter the lines to be added
read limit
i=0

while [ $i -lt $limit ]
do
echo enter the line $i
read line
echo "$line" >> test.txt
i=$(($i+1))
done


echo
while IFS= read -r line
do
echo $line
done < test.txt
