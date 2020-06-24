package live;
import music.playable;
import music.string.veena;
import music.wind.saxophone;

public class test {
	public static void main(String args[])
	{
		veena v=new veena();
		v.play();
		playable pv=new veena();
		pv.play();
		saxophone s=new saxophone();
		s.play();
		playable ps=new veena();
		ps.play();
	}

}
