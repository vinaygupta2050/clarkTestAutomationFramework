#This command will remove old logs
echo "Removing old Logs"
rm -r logs/*
echo "Running maven verify command"
#This command will download all the required maven dependancy and runs your project.
mvn clean verify