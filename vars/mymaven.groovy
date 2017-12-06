import org.skat.MyLogic

def call() {
    def myLogic = new MyLogic()
    echo "${Mylogic.helloYou()}"
}
