node {
      for (i=0; i<2; i++) { 
           stage "Stage #"+i
           print 'Hello, world !'
           if (i==0)
           {
            script {
            print "dentro del if" 
           } // fin script

           }
           else {
            print ' Termino los 2 stages'
           }
      }  
}