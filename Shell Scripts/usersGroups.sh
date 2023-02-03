# users and groups
# if system-config-users command throws an error use the following commands instead
# cat /etc/group
# cat /etc/user

while true
do
echo "1.Create Group";
echo "2.Delete Group";
echo "3.Create Users";
echo "4.Delete Users";
echo "5.Display all Users and Groups";
echo "6.Exit";
echo "Enter your choice: ";
read ch

case $ch in
1)
echo "Enter Group name: ";
read gname
groupadd $gname
system-config-users
;;

2)
echo "Delete Group: ";
read gname
groupdel $gname
system-config-users
;;

3)
echo "Enter User name: ";
read uname
echo "Enter Group name: ";
read gname
useradd $uname -g $gname
system-config-users
;;

4)
echo "Delete User: ";
read uname
userdel $uname
system-config-users
;;

5)
echo "All Users and Groups in the System: ";
system-config-users
# you can also use the following commands to perform the same action
# cat /etc/group
# cat /etc/user
;;

6)
exit;
;;

esac
done