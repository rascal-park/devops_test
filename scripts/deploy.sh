cd /home/ec2-user/deploy/build/libs

nohup java -jar jlpt-0.0.1-SNAPSHOT.jar > /home/ec2-user/jlpt/nohup.out 2>&1 &