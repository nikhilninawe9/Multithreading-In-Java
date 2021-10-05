package ThreadClassMethodsAndConstructors;

//Constructors present in Thread Class
//Thread(), Thread(Runnable target), Thread(String name), Thread( Runnable target,String name)

//Thread Group Constructors
//Thread(ThreadGroup tg,Runnable target), Thread(ThreadGroup tg,String name),
//Thread(ThreadGroup tg,Runnable target,String name), Thread(ThreadGroup tg,Runnable target,String name,long stacksize)

//----------------------------------------------------------------------//

//Methods in Thread Class [Basic methods]
//run(), start(), currentThread(), isAlive()

//[Naming methods]
//getName(), setName()

//Methods in Demon thread
//isDaemon(), setDaemon(boolean b)

//Methods for priority
//getPriority(), setPriority(int pr)

//Executions methods prevention methods
//sleep(), yield(), join(), 
// not present in java now => suspend(), resume(), stop(), destroy

//Methods who interrupt the thread
//interrupt(), isInterrupted(), interrupted()

//----------------------------------------------------------------------//

//Inter thread communicatios methods usually not present in thread class
//wait(), notify(), notifyAll()
//Above methods comes into the object class

public class Example1 implements Runnable {

	@Override
	public void run() {

	}

	public static void main(String[] args) {

	}
}
