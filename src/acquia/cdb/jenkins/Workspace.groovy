package acquia.cdb.jenkins

class Workspace implements Serializable {
//    RubyEnv ruby

//    Workspace(RubyEnv ruby) {
//        this.ruby = ruby
//    }

    void configure() {
        sh('ls')
//        ruby.exec('rvm list')
    }
}
