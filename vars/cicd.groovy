def newGit(repo)

{
  
  git "${repo}"
  
}

def newMaven()
{
  sh 'mvn package'
}

def newDeploy(jobname,ip,context)

{
  sh 'scp /home/ubuntu/.jenkins/workspace/${jobname}/webapps/target/webapp.war  ubuntu@${ip}:/var/lib/tomcat9/webapps/${context}.war'
  
}

