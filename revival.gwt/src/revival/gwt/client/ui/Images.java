package revival.gwt.client.ui;

import com.google.gwt.user.client.ui.AbstractImagePrototype;
import com.google.gwt.user.client.ui.ImageBundle;

public interface Images extends ImageBundle {

	@Resource("revival/gwt/client/ui/gui/border-map.png")
	public AbstractImagePrototype borderMap();
	
	@Resource("revival/gwt/client/ui/gui/border-option.png")
	public AbstractImagePrototype borderOption();
	
	@Resource("revival/gwt/client/ui/gui/border-pic.png")
	public AbstractImagePrototype borderPic();
	
	@Resource("revival/gwt/client/ui/gui/geiger.png")
	public AbstractImagePrototype geigerCounter();
	
	@Resource("revival/gwt/client/ui/gui/border-roster.png")
	public AbstractImagePrototype borderRoster();
	
	@Resource("revival/gwt/client/ui/gui/player.png")
	public AbstractImagePrototype player();
	
	@Resource("revival/gwt/client/ui/gui/loot.png")
	public AbstractImagePrototype loot();
	
	@Resource("revival/gwt/client/ui/gui/animal.png")
	public AbstractImagePrototype animal(); //monstertype 1
	
	@Resource("revival/gwt/client/ui/gui/humanoid.png")
	public AbstractImagePrototype humanoid(); //monstertype 3
	

/*	
	@Resource("revival/gwt/client/ui/tileset0/000.png")
	public AbstractImagePrototype ts0t000();

	@Resource("revival/gwt/client/ui/tileset0/001.png")
	public AbstractImagePrototype ts0t001();

	@Resource("revival/gwt/client/ui/tileset0/002.png")
	public AbstractImagePrototype ts0t002();

	@Resource("revival/gwt/client/ui/tileset0/003.png")
	public AbstractImagePrototype ts0t003();

	@Resource("revival/gwt/client/ui/tileset0/004.png")
	public AbstractImagePrototype ts0t004();

	@Resource("revival/gwt/client/ui/tileset0/005.png")
	public AbstractImagePrototype ts0t005();

	@Resource("revival/gwt/client/ui/tileset0/006.png")
	public AbstractImagePrototype ts0t006();

	@Resource("revival/gwt/client/ui/tileset0/007.png")
	public AbstractImagePrototype ts0t007();

	@Resource("revival/gwt/client/ui/tileset0/008.png")
	public AbstractImagePrototype ts0t008();

	@Resource("revival/gwt/client/ui/tileset0/009.png")
	public AbstractImagePrototype ts0t009();

	@Resource("revival/gwt/client/ui/tileset0/010.png")
	public AbstractImagePrototype ts0t010();

	@Resource("revival/gwt/client/ui/tileset0/011.png")
	public AbstractImagePrototype ts0t011();

	@Resource("revival/gwt/client/ui/tileset0/012.png")
	public AbstractImagePrototype ts0t012();

	@Resource("revival/gwt/client/ui/tileset0/013.png")
	public AbstractImagePrototype ts0t013();

	@Resource("revival/gwt/client/ui/tileset0/014.png")
	public AbstractImagePrototype ts0t014();

	@Resource("revival/gwt/client/ui/tileset0/015.png")
	public AbstractImagePrototype ts0t015();

	@Resource("revival/gwt/client/ui/tileset0/016.png")
	public AbstractImagePrototype ts0t016();

	@Resource("revival/gwt/client/ui/tileset0/017.png")
	public AbstractImagePrototype ts0t017();

	@Resource("revival/gwt/client/ui/tileset0/018.png")
	public AbstractImagePrototype ts0t018();

	@Resource("revival/gwt/client/ui/tileset0/019.png")
	public AbstractImagePrototype ts0t019();

	@Resource("revival/gwt/client/ui/tileset0/020.png")
	public AbstractImagePrototype ts0t020();

	@Resource("revival/gwt/client/ui/tileset0/021.png")
	public AbstractImagePrototype ts0t021();

	@Resource("revival/gwt/client/ui/tileset0/022.png")
	public AbstractImagePrototype ts0t022();

	@Resource("revival/gwt/client/ui/tileset0/023.png")
	public AbstractImagePrototype ts0t023();

	@Resource("revival/gwt/client/ui/tileset0/024.png")
	public AbstractImagePrototype ts0t024();

	@Resource("revival/gwt/client/ui/tileset0/025.png")
	public AbstractImagePrototype ts0t025();

	@Resource("revival/gwt/client/ui/tileset0/026.png")
	public AbstractImagePrototype ts0t026();

	@Resource("revival/gwt/client/ui/tileset0/027.png")
	public AbstractImagePrototype ts0t027();

	@Resource("revival/gwt/client/ui/tileset0/028.png")
	public AbstractImagePrototype ts0t028();

	@Resource("revival/gwt/client/ui/tileset0/029.png")
	public AbstractImagePrototype ts0t029();

	@Resource("revival/gwt/client/ui/tileset0/030.png")
	public AbstractImagePrototype ts0t030();

	@Resource("revival/gwt/client/ui/tileset0/031.png")
	public AbstractImagePrototype ts0t031();

	@Resource("revival/gwt/client/ui/tileset0/032.png")
	public AbstractImagePrototype ts0t032();

	@Resource("revival/gwt/client/ui/tileset0/033.png")
	public AbstractImagePrototype ts0t033();

	@Resource("revival/gwt/client/ui/tileset0/034.png")
	public AbstractImagePrototype ts0t034();

	@Resource("revival/gwt/client/ui/tileset0/035.png")
	public AbstractImagePrototype ts0t035();

	@Resource("revival/gwt/client/ui/tileset0/036.png")
	public AbstractImagePrototype ts0t036();

	@Resource("revival/gwt/client/ui/tileset0/037.png")
	public AbstractImagePrototype ts0t037();

	@Resource("revival/gwt/client/ui/tileset0/038.png")
	public AbstractImagePrototype ts0t038();

	@Resource("revival/gwt/client/ui/tileset0/039.png")
	public AbstractImagePrototype ts0t039();

	@Resource("revival/gwt/client/ui/tileset0/040.png")
	public AbstractImagePrototype ts0t040();

	@Resource("revival/gwt/client/ui/tileset0/041.png")
	public AbstractImagePrototype ts0t041();

	@Resource("revival/gwt/client/ui/tileset0/042.png")
	public AbstractImagePrototype ts0t042();

	@Resource("revival/gwt/client/ui/tileset0/043.png")
	public AbstractImagePrototype ts0t043();

	@Resource("revival/gwt/client/ui/tileset0/044.png")
	public AbstractImagePrototype ts0t044();

	@Resource("revival/gwt/client/ui/tileset0/045.png")
	public AbstractImagePrototype ts0t045();

	@Resource("revival/gwt/client/ui/tileset0/046.png")
	public AbstractImagePrototype ts0t046();

	@Resource("revival/gwt/client/ui/tileset0/047.png")
	public AbstractImagePrototype ts0t047();

	@Resource("revival/gwt/client/ui/tileset0/048.png")
	public AbstractImagePrototype ts0t048();

	@Resource("revival/gwt/client/ui/tileset0/049.png")
	public AbstractImagePrototype ts0t049();

	@Resource("revival/gwt/client/ui/tileset0/050.png")
	public AbstractImagePrototype ts0t050();

	@Resource("revival/gwt/client/ui/tileset0/051.png")
	public AbstractImagePrototype ts0t051();

	@Resource("revival/gwt/client/ui/tileset0/052.png")
	public AbstractImagePrototype ts0t052();

	@Resource("revival/gwt/client/ui/tileset0/053.png")
	public AbstractImagePrototype ts0t053();

	@Resource("revival/gwt/client/ui/tileset0/054.png")
	public AbstractImagePrototype ts0t054();

	@Resource("revival/gwt/client/ui/tileset0/055.png")
	public AbstractImagePrototype ts0t055();

	@Resource("revival/gwt/client/ui/tileset0/056.png")
	public AbstractImagePrototype ts0t056();

	@Resource("revival/gwt/client/ui/tileset0/057.png")
	public AbstractImagePrototype ts0t057();

	@Resource("revival/gwt/client/ui/tileset0/058.png")
	public AbstractImagePrototype ts0t058();

	@Resource("revival/gwt/client/ui/tileset0/059.png")
	public AbstractImagePrototype ts0t059();

	@Resource("revival/gwt/client/ui/tileset0/060.png")
	public AbstractImagePrototype ts0t060();

	@Resource("revival/gwt/client/ui/tileset0/061.png")
	public AbstractImagePrototype ts0t061();

	@Resource("revival/gwt/client/ui/tileset0/062.png")
	public AbstractImagePrototype ts0t062();

	@Resource("revival/gwt/client/ui/tileset0/063.png")
	public AbstractImagePrototype ts0t063();

	@Resource("revival/gwt/client/ui/tileset0/064.png")
	public AbstractImagePrototype ts0t064();

	@Resource("revival/gwt/client/ui/tileset0/065.png")
	public AbstractImagePrototype ts0t065();

	@Resource("revival/gwt/client/ui/tileset1/000.png")
	public AbstractImagePrototype ts1t000();

	@Resource("revival/gwt/client/ui/tileset1/001.png")
	public AbstractImagePrototype ts1t001();

	@Resource("revival/gwt/client/ui/tileset1/002.png")
	public AbstractImagePrototype ts1t002();

	@Resource("revival/gwt/client/ui/tileset1/003.png")
	public AbstractImagePrototype ts1t003();

	@Resource("revival/gwt/client/ui/tileset1/004.png")
	public AbstractImagePrototype ts1t004();

	@Resource("revival/gwt/client/ui/tileset1/005.png")
	public AbstractImagePrototype ts1t005();

	@Resource("revival/gwt/client/ui/tileset1/006.png")
	public AbstractImagePrototype ts1t006();

	@Resource("revival/gwt/client/ui/tileset1/007.png")
	public AbstractImagePrototype ts1t007();

	@Resource("revival/gwt/client/ui/tileset1/008.png")
	public AbstractImagePrototype ts1t008();

	@Resource("revival/gwt/client/ui/tileset1/009.png")
	public AbstractImagePrototype ts1t009();

	@Resource("revival/gwt/client/ui/tileset1/010.png")
	public AbstractImagePrototype ts1t010();

	@Resource("revival/gwt/client/ui/tileset1/011.png")
	public AbstractImagePrototype ts1t011();

	@Resource("revival/gwt/client/ui/tileset1/012.png")
	public AbstractImagePrototype ts1t012();

	@Resource("revival/gwt/client/ui/tileset1/013.png")
	public AbstractImagePrototype ts1t013();

	@Resource("revival/gwt/client/ui/tileset1/014.png")
	public AbstractImagePrototype ts1t014();

	@Resource("revival/gwt/client/ui/tileset1/015.png")
	public AbstractImagePrototype ts1t015();

	@Resource("revival/gwt/client/ui/tileset1/016.png")
	public AbstractImagePrototype ts1t016();

	@Resource("revival/gwt/client/ui/tileset1/017.png")
	public AbstractImagePrototype ts1t017();

	@Resource("revival/gwt/client/ui/tileset1/018.png")
	public AbstractImagePrototype ts1t018();

	@Resource("revival/gwt/client/ui/tileset1/019.png")
	public AbstractImagePrototype ts1t019();

	@Resource("revival/gwt/client/ui/tileset1/020.png")
	public AbstractImagePrototype ts1t020();

	@Resource("revival/gwt/client/ui/tileset1/021.png")
	public AbstractImagePrototype ts1t021();

	@Resource("revival/gwt/client/ui/tileset1/022.png")
	public AbstractImagePrototype ts1t022();

	@Resource("revival/gwt/client/ui/tileset1/023.png")
	public AbstractImagePrototype ts1t023();

	@Resource("revival/gwt/client/ui/tileset1/024.png")
	public AbstractImagePrototype ts1t024();

	@Resource("revival/gwt/client/ui/tileset1/025.png")
	public AbstractImagePrototype ts1t025();

	@Resource("revival/gwt/client/ui/tileset1/026.png")
	public AbstractImagePrototype ts1t026();

	@Resource("revival/gwt/client/ui/tileset1/027.png")
	public AbstractImagePrototype ts1t027();

	@Resource("revival/gwt/client/ui/tileset1/028.png")
	public AbstractImagePrototype ts1t028();

	@Resource("revival/gwt/client/ui/tileset1/029.png")
	public AbstractImagePrototype ts1t029();

	@Resource("revival/gwt/client/ui/tileset1/030.png")
	public AbstractImagePrototype ts1t030();

	@Resource("revival/gwt/client/ui/tileset1/031.png")
	public AbstractImagePrototype ts1t031();

	@Resource("revival/gwt/client/ui/tileset1/032.png")
	public AbstractImagePrototype ts1t032();

	@Resource("revival/gwt/client/ui/tileset1/033.png")
	public AbstractImagePrototype ts1t033();

	@Resource("revival/gwt/client/ui/tileset1/034.png")
	public AbstractImagePrototype ts1t034();

	@Resource("revival/gwt/client/ui/tileset1/035.png")
	public AbstractImagePrototype ts1t035();

	@Resource("revival/gwt/client/ui/tileset1/036.png")
	public AbstractImagePrototype ts1t036();

	@Resource("revival/gwt/client/ui/tileset1/037.png")
	public AbstractImagePrototype ts1t037();

	@Resource("revival/gwt/client/ui/tileset1/038.png")
	public AbstractImagePrototype ts1t038();

	@Resource("revival/gwt/client/ui/tileset1/039.png")
	public AbstractImagePrototype ts1t039();

	@Resource("revival/gwt/client/ui/tileset1/040.png")
	public AbstractImagePrototype ts1t040();

	@Resource("revival/gwt/client/ui/tileset1/041.png")
	public AbstractImagePrototype ts1t041();

	@Resource("revival/gwt/client/ui/tileset1/042.png")
	public AbstractImagePrototype ts1t042();

	@Resource("revival/gwt/client/ui/tileset1/043.png")
	public AbstractImagePrototype ts1t043();

	@Resource("revival/gwt/client/ui/tileset1/044.png")
	public AbstractImagePrototype ts1t044();

	@Resource("revival/gwt/client/ui/tileset1/045.png")
	public AbstractImagePrototype ts1t045();

	@Resource("revival/gwt/client/ui/tileset1/046.png")
	public AbstractImagePrototype ts1t046();

	@Resource("revival/gwt/client/ui/tileset1/047.png")
	public AbstractImagePrototype ts1t047();

	@Resource("revival/gwt/client/ui/tileset1/048.png")
	public AbstractImagePrototype ts1t048();

	@Resource("revival/gwt/client/ui/tileset1/049.png")
	public AbstractImagePrototype ts1t049();

	@Resource("revival/gwt/client/ui/tileset1/050.png")
	public AbstractImagePrototype ts1t050();

	@Resource("revival/gwt/client/ui/tileset1/051.png")
	public AbstractImagePrototype ts1t051();

	@Resource("revival/gwt/client/ui/tileset1/052.png")
	public AbstractImagePrototype ts1t052();

	@Resource("revival/gwt/client/ui/tileset1/053.png")
	public AbstractImagePrototype ts1t053();

	@Resource("revival/gwt/client/ui/tileset1/054.png")
	public AbstractImagePrototype ts1t054();

	@Resource("revival/gwt/client/ui/tileset1/055.png")
	public AbstractImagePrototype ts1t055();

	@Resource("revival/gwt/client/ui/tileset1/056.png")
	public AbstractImagePrototype ts1t056();

	@Resource("revival/gwt/client/ui/tileset1/057.png")
	public AbstractImagePrototype ts1t057();

	@Resource("revival/gwt/client/ui/tileset1/058.png")
	public AbstractImagePrototype ts1t058();

	@Resource("revival/gwt/client/ui/tileset1/059.png")
	public AbstractImagePrototype ts1t059();

	@Resource("revival/gwt/client/ui/tileset1/060.png")
	public AbstractImagePrototype ts1t060();

	@Resource("revival/gwt/client/ui/tileset1/061.png")
	public AbstractImagePrototype ts1t061();

	@Resource("revival/gwt/client/ui/tileset1/062.png")
	public AbstractImagePrototype ts1t062();

	@Resource("revival/gwt/client/ui/tileset1/063.png")
	public AbstractImagePrototype ts1t063();

	@Resource("revival/gwt/client/ui/tileset1/064.png")
	public AbstractImagePrototype ts1t064();

	@Resource("revival/gwt/client/ui/tileset1/065.png")
	public AbstractImagePrototype ts1t065();

	@Resource("revival/gwt/client/ui/tileset1/066.png")
	public AbstractImagePrototype ts1t066();

	@Resource("revival/gwt/client/ui/tileset1/067.png")
	public AbstractImagePrototype ts1t067();

	@Resource("revival/gwt/client/ui/tileset1/068.png")
	public AbstractImagePrototype ts1t068();

	@Resource("revival/gwt/client/ui/tileset1/069.png")
	public AbstractImagePrototype ts1t069();

	@Resource("revival/gwt/client/ui/tileset1/070.png")
	public AbstractImagePrototype ts1t070();

	@Resource("revival/gwt/client/ui/tileset1/071.png")
	public AbstractImagePrototype ts1t071();

	@Resource("revival/gwt/client/ui/tileset1/072.png")
	public AbstractImagePrototype ts1t072();

	@Resource("revival/gwt/client/ui/tileset1/073.png")
	public AbstractImagePrototype ts1t073();

	@Resource("revival/gwt/client/ui/tileset1/074.png")
	public AbstractImagePrototype ts1t074();

	@Resource("revival/gwt/client/ui/tileset1/075.png")
	public AbstractImagePrototype ts1t075();

	@Resource("revival/gwt/client/ui/tileset1/076.png")
	public AbstractImagePrototype ts1t076();

	@Resource("revival/gwt/client/ui/tileset1/077.png")
	public AbstractImagePrototype ts1t077();

	@Resource("revival/gwt/client/ui/tileset1/078.png")
	public AbstractImagePrototype ts1t078();

	@Resource("revival/gwt/client/ui/tileset1/079.png")
	public AbstractImagePrototype ts1t079();

	@Resource("revival/gwt/client/ui/tileset1/080.png")
	public AbstractImagePrototype ts1t080();

	@Resource("revival/gwt/client/ui/tileset1/081.png")
	public AbstractImagePrototype ts1t081();

	@Resource("revival/gwt/client/ui/tileset1/082.png")
	public AbstractImagePrototype ts1t082();

	@Resource("revival/gwt/client/ui/tileset1/083.png")
	public AbstractImagePrototype ts1t083();

	@Resource("revival/gwt/client/ui/tileset1/084.png")
	public AbstractImagePrototype ts1t084();

	@Resource("revival/gwt/client/ui/tileset1/085.png")
	public AbstractImagePrototype ts1t085();

	@Resource("revival/gwt/client/ui/tileset1/086.png")
	public AbstractImagePrototype ts1t086();

	@Resource("revival/gwt/client/ui/tileset1/087.png")
	public AbstractImagePrototype ts1t087();

	@Resource("revival/gwt/client/ui/tileset1/088.png")
	public AbstractImagePrototype ts1t088();

	@Resource("revival/gwt/client/ui/tileset1/089.png")
	public AbstractImagePrototype ts1t089();

	@Resource("revival/gwt/client/ui/tileset1/090.png")
	public AbstractImagePrototype ts1t090();

	@Resource("revival/gwt/client/ui/tileset1/091.png")
	public AbstractImagePrototype ts1t091();

	@Resource("revival/gwt/client/ui/tileset1/092.png")
	public AbstractImagePrototype ts1t092();

	@Resource("revival/gwt/client/ui/tileset1/093.png")
	public AbstractImagePrototype ts1t093();

	@Resource("revival/gwt/client/ui/tileset1/094.png")
	public AbstractImagePrototype ts1t094();

	@Resource("revival/gwt/client/ui/tileset1/095.png")
	public AbstractImagePrototype ts1t095();

	@Resource("revival/gwt/client/ui/tileset1/096.png")
	public AbstractImagePrototype ts1t096();

	@Resource("revival/gwt/client/ui/tileset1/097.png")
	public AbstractImagePrototype ts1t097();

	@Resource("revival/gwt/client/ui/tileset1/098.png")
	public AbstractImagePrototype ts1t098();

	@Resource("revival/gwt/client/ui/tileset1/099.png")
	public AbstractImagePrototype ts1t099();

	@Resource("revival/gwt/client/ui/tileset1/100.png")
	public AbstractImagePrototype ts1t100();

	@Resource("revival/gwt/client/ui/tileset1/101.png")
	public AbstractImagePrototype ts1t101();

	@Resource("revival/gwt/client/ui/tileset1/102.png")
	public AbstractImagePrototype ts1t102();

	@Resource("revival/gwt/client/ui/tileset1/103.png")
	public AbstractImagePrototype ts1t103();

	@Resource("revival/gwt/client/ui/tileset1/104.png")
	public AbstractImagePrototype ts1t104();

	@Resource("revival/gwt/client/ui/tileset1/105.png")
	public AbstractImagePrototype ts1t105();

	@Resource("revival/gwt/client/ui/tileset1/106.png")
	public AbstractImagePrototype ts1t106();

	@Resource("revival/gwt/client/ui/tileset1/107.png")
	public AbstractImagePrototype ts1t107();

	@Resource("revival/gwt/client/ui/tileset1/108.png")
	public AbstractImagePrototype ts1t108();

	@Resource("revival/gwt/client/ui/tileset1/109.png")
	public AbstractImagePrototype ts1t109();

	@Resource("revival/gwt/client/ui/tileset1/110.png")
	public AbstractImagePrototype ts1t110();

	@Resource("revival/gwt/client/ui/tileset1/111.png")
	public AbstractImagePrototype ts1t111();

	@Resource("revival/gwt/client/ui/tileset1/112.png")
	public AbstractImagePrototype ts1t112();

	@Resource("revival/gwt/client/ui/tileset1/113.png")
	public AbstractImagePrototype ts1t113();

	@Resource("revival/gwt/client/ui/tileset1/114.png")
	public AbstractImagePrototype ts1t114();

	@Resource("revival/gwt/client/ui/tileset1/115.png")
	public AbstractImagePrototype ts1t115();

	@Resource("revival/gwt/client/ui/tileset1/116.png")
	public AbstractImagePrototype ts1t116();

	@Resource("revival/gwt/client/ui/tileset1/117.png")
	public AbstractImagePrototype ts1t117();

	@Resource("revival/gwt/client/ui/tileset1/118.png")
	public AbstractImagePrototype ts1t118();

	@Resource("revival/gwt/client/ui/tileset1/119.png")
	public AbstractImagePrototype ts1t119();

	@Resource("revival/gwt/client/ui/tileset1/120.png")
	public AbstractImagePrototype ts1t120();

	@Resource("revival/gwt/client/ui/tileset1/121.png")
	public AbstractImagePrototype ts1t121();

	@Resource("revival/gwt/client/ui/tileset1/122.png")
	public AbstractImagePrototype ts1t122();

	@Resource("revival/gwt/client/ui/tileset1/123.png")
	public AbstractImagePrototype ts1t123();

	@Resource("revival/gwt/client/ui/tileset1/124.png")
	public AbstractImagePrototype ts1t124();

	@Resource("revival/gwt/client/ui/tileset1/125.png")
	public AbstractImagePrototype ts1t125();

	@Resource("revival/gwt/client/ui/tileset1/126.png")
	public AbstractImagePrototype ts1t126();

	@Resource("revival/gwt/client/ui/tileset1/127.png")
	public AbstractImagePrototype ts1t127();

	@Resource("revival/gwt/client/ui/tileset1/128.png")
	public AbstractImagePrototype ts1t128();

	@Resource("revival/gwt/client/ui/tileset1/129.png")
	public AbstractImagePrototype ts1t129();

	@Resource("revival/gwt/client/ui/tileset1/130.png")
	public AbstractImagePrototype ts1t130();

	@Resource("revival/gwt/client/ui/tileset1/131.png")
	public AbstractImagePrototype ts1t131();

	@Resource("revival/gwt/client/ui/tileset1/132.png")
	public AbstractImagePrototype ts1t132();

	@Resource("revival/gwt/client/ui/tileset1/133.png")
	public AbstractImagePrototype ts1t133();

	@Resource("revival/gwt/client/ui/tileset1/134.png")
	public AbstractImagePrototype ts1t134();

	@Resource("revival/gwt/client/ui/tileset1/135.png")
	public AbstractImagePrototype ts1t135();

	@Resource("revival/gwt/client/ui/tileset1/136.png")
	public AbstractImagePrototype ts1t136();

	@Resource("revival/gwt/client/ui/tileset1/137.png")
	public AbstractImagePrototype ts1t137();

	@Resource("revival/gwt/client/ui/tileset1/138.png")
	public AbstractImagePrototype ts1t138();

	@Resource("revival/gwt/client/ui/tileset1/139.png")
	public AbstractImagePrototype ts1t139();

	@Resource("revival/gwt/client/ui/tileset1/140.png")
	public AbstractImagePrototype ts1t140();

	@Resource("revival/gwt/client/ui/tileset2/000.png")
	public AbstractImagePrototype ts2t000();

	@Resource("revival/gwt/client/ui/tileset2/001.png")
	public AbstractImagePrototype ts2t001();

	@Resource("revival/gwt/client/ui/tileset2/002.png")
	public AbstractImagePrototype ts2t002();

	@Resource("revival/gwt/client/ui/tileset2/003.png")
	public AbstractImagePrototype ts2t003();

	@Resource("revival/gwt/client/ui/tileset2/004.png")
	public AbstractImagePrototype ts2t004();

	@Resource("revival/gwt/client/ui/tileset2/005.png")
	public AbstractImagePrototype ts2t005();

	@Resource("revival/gwt/client/ui/tileset2/006.png")
	public AbstractImagePrototype ts2t006();

	@Resource("revival/gwt/client/ui/tileset2/007.png")
	public AbstractImagePrototype ts2t007();

	@Resource("revival/gwt/client/ui/tileset2/008.png")
	public AbstractImagePrototype ts2t008();

	@Resource("revival/gwt/client/ui/tileset2/009.png")
	public AbstractImagePrototype ts2t009();

	@Resource("revival/gwt/client/ui/tileset2/010.png")
	public AbstractImagePrototype ts2t010();

	@Resource("revival/gwt/client/ui/tileset2/011.png")
	public AbstractImagePrototype ts2t011();

	@Resource("revival/gwt/client/ui/tileset2/012.png")
	public AbstractImagePrototype ts2t012();

	@Resource("revival/gwt/client/ui/tileset2/013.png")
	public AbstractImagePrototype ts2t013();

	@Resource("revival/gwt/client/ui/tileset2/014.png")
	public AbstractImagePrototype ts2t014();

	@Resource("revival/gwt/client/ui/tileset2/015.png")
	public AbstractImagePrototype ts2t015();

	@Resource("revival/gwt/client/ui/tileset2/016.png")
	public AbstractImagePrototype ts2t016();

	@Resource("revival/gwt/client/ui/tileset2/017.png")
	public AbstractImagePrototype ts2t017();

	@Resource("revival/gwt/client/ui/tileset2/018.png")
	public AbstractImagePrototype ts2t018();

	@Resource("revival/gwt/client/ui/tileset2/019.png")
	public AbstractImagePrototype ts2t019();

	@Resource("revival/gwt/client/ui/tileset2/020.png")
	public AbstractImagePrototype ts2t020();

	@Resource("revival/gwt/client/ui/tileset2/021.png")
	public AbstractImagePrototype ts2t021();

	@Resource("revival/gwt/client/ui/tileset2/022.png")
	public AbstractImagePrototype ts2t022();

	@Resource("revival/gwt/client/ui/tileset2/023.png")
	public AbstractImagePrototype ts2t023();

	@Resource("revival/gwt/client/ui/tileset2/024.png")
	public AbstractImagePrototype ts2t024();

	@Resource("revival/gwt/client/ui/tileset2/025.png")
	public AbstractImagePrototype ts2t025();

	@Resource("revival/gwt/client/ui/tileset2/026.png")
	public AbstractImagePrototype ts2t026();

	@Resource("revival/gwt/client/ui/tileset2/027.png")
	public AbstractImagePrototype ts2t027();

	@Resource("revival/gwt/client/ui/tileset2/028.png")
	public AbstractImagePrototype ts2t028();

	@Resource("revival/gwt/client/ui/tileset2/029.png")
	public AbstractImagePrototype ts2t029();

	@Resource("revival/gwt/client/ui/tileset2/030.png")
	public AbstractImagePrototype ts2t030();

	@Resource("revival/gwt/client/ui/tileset2/031.png")
	public AbstractImagePrototype ts2t031();

	@Resource("revival/gwt/client/ui/tileset2/032.png")
	public AbstractImagePrototype ts2t032();

	@Resource("revival/gwt/client/ui/tileset2/033.png")
	public AbstractImagePrototype ts2t033();

	@Resource("revival/gwt/client/ui/tileset2/034.png")
	public AbstractImagePrototype ts2t034();

	@Resource("revival/gwt/client/ui/tileset2/035.png")
	public AbstractImagePrototype ts2t035();

	@Resource("revival/gwt/client/ui/tileset2/036.png")
	public AbstractImagePrototype ts2t036();

	@Resource("revival/gwt/client/ui/tileset2/037.png")
	public AbstractImagePrototype ts2t037();

	@Resource("revival/gwt/client/ui/tileset2/038.png")
	public AbstractImagePrototype ts2t038();

	@Resource("revival/gwt/client/ui/tileset2/039.png")
	public AbstractImagePrototype ts2t039();

	@Resource("revival/gwt/client/ui/tileset2/040.png")
	public AbstractImagePrototype ts2t040();

	@Resource("revival/gwt/client/ui/tileset2/041.png")
	public AbstractImagePrototype ts2t041();

	@Resource("revival/gwt/client/ui/tileset2/042.png")
	public AbstractImagePrototype ts2t042();

	@Resource("revival/gwt/client/ui/tileset2/043.png")
	public AbstractImagePrototype ts2t043();

	@Resource("revival/gwt/client/ui/tileset2/044.png")
	public AbstractImagePrototype ts2t044();

	@Resource("revival/gwt/client/ui/tileset2/045.png")
	public AbstractImagePrototype ts2t045();

	@Resource("revival/gwt/client/ui/tileset2/046.png")
	public AbstractImagePrototype ts2t046();

	@Resource("revival/gwt/client/ui/tileset2/047.png")
	public AbstractImagePrototype ts2t047();

	@Resource("revival/gwt/client/ui/tileset2/048.png")
	public AbstractImagePrototype ts2t048();

	@Resource("revival/gwt/client/ui/tileset2/049.png")
	public AbstractImagePrototype ts2t049();

	@Resource("revival/gwt/client/ui/tileset2/050.png")
	public AbstractImagePrototype ts2t050();

	@Resource("revival/gwt/client/ui/tileset2/051.png")
	public AbstractImagePrototype ts2t051();

	@Resource("revival/gwt/client/ui/tileset2/052.png")
	public AbstractImagePrototype ts2t052();

	@Resource("revival/gwt/client/ui/tileset2/053.png")
	public AbstractImagePrototype ts2t053();

	@Resource("revival/gwt/client/ui/tileset2/054.png")
	public AbstractImagePrototype ts2t054();

	@Resource("revival/gwt/client/ui/tileset2/055.png")
	public AbstractImagePrototype ts2t055();

	@Resource("revival/gwt/client/ui/tileset2/056.png")
	public AbstractImagePrototype ts2t056();

	@Resource("revival/gwt/client/ui/tileset2/057.png")
	public AbstractImagePrototype ts2t057();

	@Resource("revival/gwt/client/ui/tileset2/058.png")
	public AbstractImagePrototype ts2t058();

	@Resource("revival/gwt/client/ui/tileset2/059.png")
	public AbstractImagePrototype ts2t059();

	@Resource("revival/gwt/client/ui/tileset2/060.png")
	public AbstractImagePrototype ts2t060();

	@Resource("revival/gwt/client/ui/tileset2/061.png")
	public AbstractImagePrototype ts2t061();

	@Resource("revival/gwt/client/ui/tileset2/062.png")
	public AbstractImagePrototype ts2t062();

	@Resource("revival/gwt/client/ui/tileset2/063.png")
	public AbstractImagePrototype ts2t063();

	@Resource("revival/gwt/client/ui/tileset2/064.png")
	public AbstractImagePrototype ts2t064();

	@Resource("revival/gwt/client/ui/tileset2/065.png")
	public AbstractImagePrototype ts2t065();

	@Resource("revival/gwt/client/ui/tileset2/066.png")
	public AbstractImagePrototype ts2t066();

	@Resource("revival/gwt/client/ui/tileset2/067.png")
	public AbstractImagePrototype ts2t067();

	@Resource("revival/gwt/client/ui/tileset2/068.png")
	public AbstractImagePrototype ts2t068();

	@Resource("revival/gwt/client/ui/tileset2/069.png")
	public AbstractImagePrototype ts2t069();

	@Resource("revival/gwt/client/ui/tileset2/070.png")
	public AbstractImagePrototype ts2t070();

	@Resource("revival/gwt/client/ui/tileset2/071.png")
	public AbstractImagePrototype ts2t071();

	@Resource("revival/gwt/client/ui/tileset2/072.png")
	public AbstractImagePrototype ts2t072();

	@Resource("revival/gwt/client/ui/tileset2/073.png")
	public AbstractImagePrototype ts2t073();

	@Resource("revival/gwt/client/ui/tileset2/074.png")
	public AbstractImagePrototype ts2t074();

	@Resource("revival/gwt/client/ui/tileset2/075.png")
	public AbstractImagePrototype ts2t075();

	@Resource("revival/gwt/client/ui/tileset2/076.png")
	public AbstractImagePrototype ts2t076();

	@Resource("revival/gwt/client/ui/tileset2/077.png")
	public AbstractImagePrototype ts2t077();

	@Resource("revival/gwt/client/ui/tileset2/078.png")
	public AbstractImagePrototype ts2t078();

	@Resource("revival/gwt/client/ui/tileset2/079.png")
	public AbstractImagePrototype ts2t079();

	@Resource("revival/gwt/client/ui/tileset2/080.png")
	public AbstractImagePrototype ts2t080();

	@Resource("revival/gwt/client/ui/tileset2/081.png")
	public AbstractImagePrototype ts2t081();

	@Resource("revival/gwt/client/ui/tileset2/082.png")
	public AbstractImagePrototype ts2t082();

	@Resource("revival/gwt/client/ui/tileset2/083.png")
	public AbstractImagePrototype ts2t083();

	@Resource("revival/gwt/client/ui/tileset2/084.png")
	public AbstractImagePrototype ts2t084();

	@Resource("revival/gwt/client/ui/tileset2/085.png")
	public AbstractImagePrototype ts2t085();

	@Resource("revival/gwt/client/ui/tileset2/086.png")
	public AbstractImagePrototype ts2t086();

	@Resource("revival/gwt/client/ui/tileset2/087.png")
	public AbstractImagePrototype ts2t087();

	@Resource("revival/gwt/client/ui/tileset2/088.png")
	public AbstractImagePrototype ts2t088();

	@Resource("revival/gwt/client/ui/tileset2/089.png")
	public AbstractImagePrototype ts2t089();

	@Resource("revival/gwt/client/ui/tileset2/090.png")
	public AbstractImagePrototype ts2t090();

	@Resource("revival/gwt/client/ui/tileset2/091.png")
	public AbstractImagePrototype ts2t091();

	@Resource("revival/gwt/client/ui/tileset2/092.png")
	public AbstractImagePrototype ts2t092();

	@Resource("revival/gwt/client/ui/tileset2/093.png")
	public AbstractImagePrototype ts2t093();

	@Resource("revival/gwt/client/ui/tileset2/094.png")
	public AbstractImagePrototype ts2t094();

	@Resource("revival/gwt/client/ui/tileset2/095.png")
	public AbstractImagePrototype ts2t095();

	@Resource("revival/gwt/client/ui/tileset2/096.png")
	public AbstractImagePrototype ts2t096();

	@Resource("revival/gwt/client/ui/tileset2/097.png")
	public AbstractImagePrototype ts2t097();

	@Resource("revival/gwt/client/ui/tileset2/098.png")
	public AbstractImagePrototype ts2t098();

	@Resource("revival/gwt/client/ui/tileset2/099.png")
	public AbstractImagePrototype ts2t099();

	@Resource("revival/gwt/client/ui/tileset2/100.png")
	public AbstractImagePrototype ts2t100();

	@Resource("revival/gwt/client/ui/tileset2/101.png")
	public AbstractImagePrototype ts2t101();

	@Resource("revival/gwt/client/ui/tileset2/102.png")
	public AbstractImagePrototype ts2t102();

	@Resource("revival/gwt/client/ui/tileset2/103.png")
	public AbstractImagePrototype ts2t103();

	@Resource("revival/gwt/client/ui/tileset2/104.png")
	public AbstractImagePrototype ts2t104();

	@Resource("revival/gwt/client/ui/tileset2/105.png")
	public AbstractImagePrototype ts2t105();

	@Resource("revival/gwt/client/ui/tileset2/106.png")
	public AbstractImagePrototype ts2t106();

	@Resource("revival/gwt/client/ui/tileset2/107.png")
	public AbstractImagePrototype ts2t107();

	@Resource("revival/gwt/client/ui/tileset2/108.png")
	public AbstractImagePrototype ts2t108();

	@Resource("revival/gwt/client/ui/tileset2/109.png")
	public AbstractImagePrototype ts2t109();

	@Resource("revival/gwt/client/ui/tileset2/110.png")
	public AbstractImagePrototype ts2t110();

	@Resource("revival/gwt/client/ui/tileset2/111.png")
	public AbstractImagePrototype ts2t111();

	@Resource("revival/gwt/client/ui/tileset2/112.png")
	public AbstractImagePrototype ts2t112();

	@Resource("revival/gwt/client/ui/tileset2/113.png")
	public AbstractImagePrototype ts2t113();

	@Resource("revival/gwt/client/ui/tileset2/114.png")
	public AbstractImagePrototype ts2t114();

	@Resource("revival/gwt/client/ui/tileset2/115.png")
	public AbstractImagePrototype ts2t115();

	@Resource("revival/gwt/client/ui/tileset2/116.png")
	public AbstractImagePrototype ts2t116();

	@Resource("revival/gwt/client/ui/tileset2/117.png")
	public AbstractImagePrototype ts2t117();

	@Resource("revival/gwt/client/ui/tileset2/118.png")
	public AbstractImagePrototype ts2t118();

	@Resource("revival/gwt/client/ui/tileset2/119.png")
	public AbstractImagePrototype ts2t119();

	@Resource("revival/gwt/client/ui/tileset2/120.png")
	public AbstractImagePrototype ts2t120();

	@Resource("revival/gwt/client/ui/tileset2/121.png")
	public AbstractImagePrototype ts2t121();

	@Resource("revival/gwt/client/ui/tileset2/122.png")
	public AbstractImagePrototype ts2t122();

	@Resource("revival/gwt/client/ui/tileset2/123.png")
	public AbstractImagePrototype ts2t123();

	@Resource("revival/gwt/client/ui/tileset2/124.png")
	public AbstractImagePrototype ts2t124();

	@Resource("revival/gwt/client/ui/tileset2/125.png")
	public AbstractImagePrototype ts2t125();

	@Resource("revival/gwt/client/ui/tileset2/126.png")
	public AbstractImagePrototype ts2t126();

	@Resource("revival/gwt/client/ui/tileset2/127.png")
	public AbstractImagePrototype ts2t127();

	@Resource("revival/gwt/client/ui/tileset2/128.png")
	public AbstractImagePrototype ts2t128();

	@Resource("revival/gwt/client/ui/tileset2/129.png")
	public AbstractImagePrototype ts2t129();

	@Resource("revival/gwt/client/ui/tileset2/130.png")
	public AbstractImagePrototype ts2t130();

	@Resource("revival/gwt/client/ui/tileset2/131.png")
	public AbstractImagePrototype ts2t131();

	@Resource("revival/gwt/client/ui/tileset2/132.png")
	public AbstractImagePrototype ts2t132();

	@Resource("revival/gwt/client/ui/tileset2/133.png")
	public AbstractImagePrototype ts2t133();

	@Resource("revival/gwt/client/ui/tileset2/134.png")
	public AbstractImagePrototype ts2t134();

	@Resource("revival/gwt/client/ui/tileset2/135.png")
	public AbstractImagePrototype ts2t135();

	@Resource("revival/gwt/client/ui/tileset2/136.png")
	public AbstractImagePrototype ts2t136();

	@Resource("revival/gwt/client/ui/tileset2/137.png")
	public AbstractImagePrototype ts2t137();

	@Resource("revival/gwt/client/ui/tileset2/138.png")
	public AbstractImagePrototype ts2t138();

	@Resource("revival/gwt/client/ui/tileset2/139.png")
	public AbstractImagePrototype ts2t139();

	@Resource("revival/gwt/client/ui/tileset2/140.png")
	public AbstractImagePrototype ts2t140();

	@Resource("revival/gwt/client/ui/tileset2/141.png")
	public AbstractImagePrototype ts2t141();

	@Resource("revival/gwt/client/ui/tileset2/142.png")
	public AbstractImagePrototype ts2t142();

	@Resource("revival/gwt/client/ui/tileset2/143.png")
	public AbstractImagePrototype ts2t143();

	@Resource("revival/gwt/client/ui/tileset2/144.png")
	public AbstractImagePrototype ts2t144();

	@Resource("revival/gwt/client/ui/tileset2/145.png")
	public AbstractImagePrototype ts2t145();

	@Resource("revival/gwt/client/ui/tileset2/146.png")
	public AbstractImagePrototype ts2t146();

	@Resource("revival/gwt/client/ui/tileset2/147.png")
	public AbstractImagePrototype ts2t147();

	@Resource("revival/gwt/client/ui/tileset2/148.png")
	public AbstractImagePrototype ts2t148();

	@Resource("revival/gwt/client/ui/tileset2/149.png")
	public AbstractImagePrototype ts2t149();

	@Resource("revival/gwt/client/ui/tileset2/150.png")
	public AbstractImagePrototype ts2t150();

	@Resource("revival/gwt/client/ui/tileset2/151.png")
	public AbstractImagePrototype ts2t151();

	@Resource("revival/gwt/client/ui/tileset2/152.png")
	public AbstractImagePrototype ts2t152();

	@Resource("revival/gwt/client/ui/tileset2/153.png")
	public AbstractImagePrototype ts2t153();

	@Resource("revival/gwt/client/ui/tileset2/154.png")
	public AbstractImagePrototype ts2t154();

	@Resource("revival/gwt/client/ui/tileset2/155.png")
	public AbstractImagePrototype ts2t155();

	@Resource("revival/gwt/client/ui/tileset2/156.png")
	public AbstractImagePrototype ts2t156();

	@Resource("revival/gwt/client/ui/tileset2/157.png")
	public AbstractImagePrototype ts2t157();

	@Resource("revival/gwt/client/ui/tileset2/158.png")
	public AbstractImagePrototype ts2t158();

	@Resource("revival/gwt/client/ui/tileset2/159.png")
	public AbstractImagePrototype ts2t159();

	@Resource("revival/gwt/client/ui/tileset2/160.png")
	public AbstractImagePrototype ts2t160();

	@Resource("revival/gwt/client/ui/tileset2/161.png")
	public AbstractImagePrototype ts2t161();

	@Resource("revival/gwt/client/ui/tileset2/162.png")
	public AbstractImagePrototype ts2t162();

	@Resource("revival/gwt/client/ui/tileset3/000.png")
	public AbstractImagePrototype ts3t000();

	@Resource("revival/gwt/client/ui/tileset3/001.png")
	public AbstractImagePrototype ts3t001();

	@Resource("revival/gwt/client/ui/tileset3/002.png")
	public AbstractImagePrototype ts3t002();

	@Resource("revival/gwt/client/ui/tileset3/003.png")
	public AbstractImagePrototype ts3t003();

	@Resource("revival/gwt/client/ui/tileset3/004.png")
	public AbstractImagePrototype ts3t004();

	@Resource("revival/gwt/client/ui/tileset3/005.png")
	public AbstractImagePrototype ts3t005();

	@Resource("revival/gwt/client/ui/tileset3/006.png")
	public AbstractImagePrototype ts3t006();

	@Resource("revival/gwt/client/ui/tileset3/007.png")
	public AbstractImagePrototype ts3t007();

	@Resource("revival/gwt/client/ui/tileset3/008.png")
	public AbstractImagePrototype ts3t008();

	@Resource("revival/gwt/client/ui/tileset3/009.png")
	public AbstractImagePrototype ts3t009();

	@Resource("revival/gwt/client/ui/tileset3/010.png")
	public AbstractImagePrototype ts3t010();

	@Resource("revival/gwt/client/ui/tileset3/011.png")
	public AbstractImagePrototype ts3t011();

	@Resource("revival/gwt/client/ui/tileset3/012.png")
	public AbstractImagePrototype ts3t012();

	@Resource("revival/gwt/client/ui/tileset3/013.png")
	public AbstractImagePrototype ts3t013();

	@Resource("revival/gwt/client/ui/tileset3/014.png")
	public AbstractImagePrototype ts3t014();

	@Resource("revival/gwt/client/ui/tileset3/015.png")
	public AbstractImagePrototype ts3t015();

	@Resource("revival/gwt/client/ui/tileset3/016.png")
	public AbstractImagePrototype ts3t016();

	@Resource("revival/gwt/client/ui/tileset3/017.png")
	public AbstractImagePrototype ts3t017();

	@Resource("revival/gwt/client/ui/tileset3/018.png")
	public AbstractImagePrototype ts3t018();

	@Resource("revival/gwt/client/ui/tileset3/019.png")
	public AbstractImagePrototype ts3t019();

	@Resource("revival/gwt/client/ui/tileset3/020.png")
	public AbstractImagePrototype ts3t020();

	@Resource("revival/gwt/client/ui/tileset3/021.png")
	public AbstractImagePrototype ts3t021();

	@Resource("revival/gwt/client/ui/tileset3/022.png")
	public AbstractImagePrototype ts3t022();

	@Resource("revival/gwt/client/ui/tileset3/023.png")
	public AbstractImagePrototype ts3t023();

	@Resource("revival/gwt/client/ui/tileset3/024.png")
	public AbstractImagePrototype ts3t024();

	@Resource("revival/gwt/client/ui/tileset3/025.png")
	public AbstractImagePrototype ts3t025();

	@Resource("revival/gwt/client/ui/tileset3/026.png")
	public AbstractImagePrototype ts3t026();

	@Resource("revival/gwt/client/ui/tileset3/027.png")
	public AbstractImagePrototype ts3t027();

	@Resource("revival/gwt/client/ui/tileset3/028.png")
	public AbstractImagePrototype ts3t028();

	@Resource("revival/gwt/client/ui/tileset3/029.png")
	public AbstractImagePrototype ts3t029();

	@Resource("revival/gwt/client/ui/tileset3/030.png")
	public AbstractImagePrototype ts3t030();

	@Resource("revival/gwt/client/ui/tileset3/031.png")
	public AbstractImagePrototype ts3t031();

	@Resource("revival/gwt/client/ui/tileset3/032.png")
	public AbstractImagePrototype ts3t032();

	@Resource("revival/gwt/client/ui/tileset3/033.png")
	public AbstractImagePrototype ts3t033();

	@Resource("revival/gwt/client/ui/tileset3/034.png")
	public AbstractImagePrototype ts3t034();

	@Resource("revival/gwt/client/ui/tileset3/035.png")
	public AbstractImagePrototype ts3t035();

	@Resource("revival/gwt/client/ui/tileset3/036.png")
	public AbstractImagePrototype ts3t036();

	@Resource("revival/gwt/client/ui/tileset3/037.png")
	public AbstractImagePrototype ts3t037();

	@Resource("revival/gwt/client/ui/tileset3/038.png")
	public AbstractImagePrototype ts3t038();

	@Resource("revival/gwt/client/ui/tileset3/039.png")
	public AbstractImagePrototype ts3t039();

	@Resource("revival/gwt/client/ui/tileset3/040.png")
	public AbstractImagePrototype ts3t040();

	@Resource("revival/gwt/client/ui/tileset3/041.png")
	public AbstractImagePrototype ts3t041();

	@Resource("revival/gwt/client/ui/tileset3/042.png")
	public AbstractImagePrototype ts3t042();

	@Resource("revival/gwt/client/ui/tileset3/043.png")
	public AbstractImagePrototype ts3t043();

	@Resource("revival/gwt/client/ui/tileset3/044.png")
	public AbstractImagePrototype ts3t044();

	@Resource("revival/gwt/client/ui/tileset3/045.png")
	public AbstractImagePrototype ts3t045();

	@Resource("revival/gwt/client/ui/tileset3/046.png")
	public AbstractImagePrototype ts3t046();

	@Resource("revival/gwt/client/ui/tileset3/047.png")
	public AbstractImagePrototype ts3t047();

	@Resource("revival/gwt/client/ui/tileset3/048.png")
	public AbstractImagePrototype ts3t048();

	@Resource("revival/gwt/client/ui/tileset3/049.png")
	public AbstractImagePrototype ts3t049();

	@Resource("revival/gwt/client/ui/tileset3/050.png")
	public AbstractImagePrototype ts3t050();

	@Resource("revival/gwt/client/ui/tileset3/051.png")
	public AbstractImagePrototype ts3t051();

	@Resource("revival/gwt/client/ui/tileset3/052.png")
	public AbstractImagePrototype ts3t052();

	@Resource("revival/gwt/client/ui/tileset3/053.png")
	public AbstractImagePrototype ts3t053();

	@Resource("revival/gwt/client/ui/tileset3/054.png")
	public AbstractImagePrototype ts3t054();

	@Resource("revival/gwt/client/ui/tileset3/055.png")
	public AbstractImagePrototype ts3t055();

	@Resource("revival/gwt/client/ui/tileset3/056.png")
	public AbstractImagePrototype ts3t056();

	@Resource("revival/gwt/client/ui/tileset3/057.png")
	public AbstractImagePrototype ts3t057();

	@Resource("revival/gwt/client/ui/tileset3/058.png")
	public AbstractImagePrototype ts3t058();

	@Resource("revival/gwt/client/ui/tileset3/059.png")
	public AbstractImagePrototype ts3t059();

	@Resource("revival/gwt/client/ui/tileset3/060.png")
	public AbstractImagePrototype ts3t060();

	@Resource("revival/gwt/client/ui/tileset3/061.png")
	public AbstractImagePrototype ts3t061();

	@Resource("revival/gwt/client/ui/tileset3/062.png")
	public AbstractImagePrototype ts3t062();

	@Resource("revival/gwt/client/ui/tileset3/063.png")
	public AbstractImagePrototype ts3t063();

	@Resource("revival/gwt/client/ui/tileset3/064.png")
	public AbstractImagePrototype ts3t064();

	@Resource("revival/gwt/client/ui/tileset3/065.png")
	public AbstractImagePrototype ts3t065();

	@Resource("revival/gwt/client/ui/tileset3/066.png")
	public AbstractImagePrototype ts3t066();

	@Resource("revival/gwt/client/ui/tileset3/067.png")
	public AbstractImagePrototype ts3t067();

	@Resource("revival/gwt/client/ui/tileset3/068.png")
	public AbstractImagePrototype ts3t068();

	@Resource("revival/gwt/client/ui/tileset3/069.png")
	public AbstractImagePrototype ts3t069();

	@Resource("revival/gwt/client/ui/tileset3/070.png")
	public AbstractImagePrototype ts3t070();

	@Resource("revival/gwt/client/ui/tileset3/071.png")
	public AbstractImagePrototype ts3t071();

	@Resource("revival/gwt/client/ui/tileset3/072.png")
	public AbstractImagePrototype ts3t072();

	@Resource("revival/gwt/client/ui/tileset3/073.png")
	public AbstractImagePrototype ts3t073();

	@Resource("revival/gwt/client/ui/tileset3/074.png")
	public AbstractImagePrototype ts3t074();

	@Resource("revival/gwt/client/ui/tileset3/075.png")
	public AbstractImagePrototype ts3t075();

	@Resource("revival/gwt/client/ui/tileset3/076.png")
	public AbstractImagePrototype ts3t076();

	@Resource("revival/gwt/client/ui/tileset3/077.png")
	public AbstractImagePrototype ts3t077();

	@Resource("revival/gwt/client/ui/tileset3/078.png")
	public AbstractImagePrototype ts3t078();

	@Resource("revival/gwt/client/ui/tileset3/079.png")
	public AbstractImagePrototype ts3t079();

	@Resource("revival/gwt/client/ui/tileset3/080.png")
	public AbstractImagePrototype ts3t080();

	@Resource("revival/gwt/client/ui/tileset3/081.png")
	public AbstractImagePrototype ts3t081();

	@Resource("revival/gwt/client/ui/tileset3/082.png")
	public AbstractImagePrototype ts3t082();

	@Resource("revival/gwt/client/ui/tileset3/083.png")
	public AbstractImagePrototype ts3t083();

	@Resource("revival/gwt/client/ui/tileset3/084.png")
	public AbstractImagePrototype ts3t084();

	@Resource("revival/gwt/client/ui/tileset3/085.png")
	public AbstractImagePrototype ts3t085();

	@Resource("revival/gwt/client/ui/tileset3/086.png")
	public AbstractImagePrototype ts3t086();

	@Resource("revival/gwt/client/ui/tileset3/087.png")
	public AbstractImagePrototype ts3t087();

	@Resource("revival/gwt/client/ui/tileset3/088.png")
	public AbstractImagePrototype ts3t088();

	@Resource("revival/gwt/client/ui/tileset3/089.png")
	public AbstractImagePrototype ts3t089();

	@Resource("revival/gwt/client/ui/tileset3/090.png")
	public AbstractImagePrototype ts3t090();

	@Resource("revival/gwt/client/ui/tileset3/091.png")
	public AbstractImagePrototype ts3t091();

	@Resource("revival/gwt/client/ui/tileset3/092.png")
	public AbstractImagePrototype ts3t092();

	@Resource("revival/gwt/client/ui/tileset3/093.png")
	public AbstractImagePrototype ts3t093();

	@Resource("revival/gwt/client/ui/tileset3/094.png")
	public AbstractImagePrototype ts3t094();

	@Resource("revival/gwt/client/ui/tileset3/095.png")
	public AbstractImagePrototype ts3t095();

	@Resource("revival/gwt/client/ui/tileset3/096.png")
	public AbstractImagePrototype ts3t096();

	@Resource("revival/gwt/client/ui/tileset3/097.png")
	public AbstractImagePrototype ts3t097();

	@Resource("revival/gwt/client/ui/tileset3/098.png")
	public AbstractImagePrototype ts3t098();

	@Resource("revival/gwt/client/ui/tileset3/099.png")
	public AbstractImagePrototype ts3t099();

	@Resource("revival/gwt/client/ui/tileset3/100.png")
	public AbstractImagePrototype ts3t100();

	@Resource("revival/gwt/client/ui/tileset3/101.png")
	public AbstractImagePrototype ts3t101();

	@Resource("revival/gwt/client/ui/tileset3/102.png")
	public AbstractImagePrototype ts3t102();

	@Resource("revival/gwt/client/ui/tileset3/103.png")
	public AbstractImagePrototype ts3t103();

	@Resource("revival/gwt/client/ui/tileset3/104.png")
	public AbstractImagePrototype ts3t104();

	@Resource("revival/gwt/client/ui/tileset3/105.png")
	public AbstractImagePrototype ts3t105();

	@Resource("revival/gwt/client/ui/tileset3/106.png")
	public AbstractImagePrototype ts3t106();

	@Resource("revival/gwt/client/ui/tileset4/000.png")
	public AbstractImagePrototype ts4t000();

	@Resource("revival/gwt/client/ui/tileset4/001.png")
	public AbstractImagePrototype ts4t001();

	@Resource("revival/gwt/client/ui/tileset4/002.png")
	public AbstractImagePrototype ts4t002();

	@Resource("revival/gwt/client/ui/tileset4/003.png")
	public AbstractImagePrototype ts4t003();

	@Resource("revival/gwt/client/ui/tileset4/004.png")
	public AbstractImagePrototype ts4t004();

	@Resource("revival/gwt/client/ui/tileset4/005.png")
	public AbstractImagePrototype ts4t005();

	@Resource("revival/gwt/client/ui/tileset4/006.png")
	public AbstractImagePrototype ts4t006();

	@Resource("revival/gwt/client/ui/tileset4/007.png")
	public AbstractImagePrototype ts4t007();

	@Resource("revival/gwt/client/ui/tileset4/008.png")
	public AbstractImagePrototype ts4t008();

	@Resource("revival/gwt/client/ui/tileset4/009.png")
	public AbstractImagePrototype ts4t009();

	@Resource("revival/gwt/client/ui/tileset4/010.png")
	public AbstractImagePrototype ts4t010();

	@Resource("revival/gwt/client/ui/tileset4/011.png")
	public AbstractImagePrototype ts4t011();

	@Resource("revival/gwt/client/ui/tileset4/012.png")
	public AbstractImagePrototype ts4t012();

	@Resource("revival/gwt/client/ui/tileset4/013.png")
	public AbstractImagePrototype ts4t013();

	@Resource("revival/gwt/client/ui/tileset4/014.png")
	public AbstractImagePrototype ts4t014();

	@Resource("revival/gwt/client/ui/tileset4/015.png")
	public AbstractImagePrototype ts4t015();

	@Resource("revival/gwt/client/ui/tileset4/016.png")
	public AbstractImagePrototype ts4t016();

	@Resource("revival/gwt/client/ui/tileset4/017.png")
	public AbstractImagePrototype ts4t017();

	@Resource("revival/gwt/client/ui/tileset4/018.png")
	public AbstractImagePrototype ts4t018();

	@Resource("revival/gwt/client/ui/tileset4/019.png")
	public AbstractImagePrototype ts4t019();

	@Resource("revival/gwt/client/ui/tileset4/020.png")
	public AbstractImagePrototype ts4t020();

	@Resource("revival/gwt/client/ui/tileset4/021.png")
	public AbstractImagePrototype ts4t021();

	@Resource("revival/gwt/client/ui/tileset4/022.png")
	public AbstractImagePrototype ts4t022();

	@Resource("revival/gwt/client/ui/tileset4/023.png")
	public AbstractImagePrototype ts4t023();

	@Resource("revival/gwt/client/ui/tileset4/024.png")
	public AbstractImagePrototype ts4t024();

	@Resource("revival/gwt/client/ui/tileset4/025.png")
	public AbstractImagePrototype ts4t025();

	@Resource("revival/gwt/client/ui/tileset4/026.png")
	public AbstractImagePrototype ts4t026();

	@Resource("revival/gwt/client/ui/tileset4/027.png")
	public AbstractImagePrototype ts4t027();

	@Resource("revival/gwt/client/ui/tileset4/028.png")
	public AbstractImagePrototype ts4t028();

	@Resource("revival/gwt/client/ui/tileset4/029.png")
	public AbstractImagePrototype ts4t029();

	@Resource("revival/gwt/client/ui/tileset4/030.png")
	public AbstractImagePrototype ts4t030();

	@Resource("revival/gwt/client/ui/tileset4/031.png")
	public AbstractImagePrototype ts4t031();

	@Resource("revival/gwt/client/ui/tileset4/032.png")
	public AbstractImagePrototype ts4t032();

	@Resource("revival/gwt/client/ui/tileset4/033.png")
	public AbstractImagePrototype ts4t033();

	@Resource("revival/gwt/client/ui/tileset4/034.png")
	public AbstractImagePrototype ts4t034();

	@Resource("revival/gwt/client/ui/tileset4/035.png")
	public AbstractImagePrototype ts4t035();

	@Resource("revival/gwt/client/ui/tileset4/036.png")
	public AbstractImagePrototype ts4t036();

	@Resource("revival/gwt/client/ui/tileset4/037.png")
	public AbstractImagePrototype ts4t037();

	@Resource("revival/gwt/client/ui/tileset4/038.png")
	public AbstractImagePrototype ts4t038();

	@Resource("revival/gwt/client/ui/tileset4/039.png")
	public AbstractImagePrototype ts4t039();

	@Resource("revival/gwt/client/ui/tileset4/040.png")
	public AbstractImagePrototype ts4t040();

	@Resource("revival/gwt/client/ui/tileset4/041.png")
	public AbstractImagePrototype ts4t041();

	@Resource("revival/gwt/client/ui/tileset4/042.png")
	public AbstractImagePrototype ts4t042();

	@Resource("revival/gwt/client/ui/tileset4/043.png")
	public AbstractImagePrototype ts4t043();

	@Resource("revival/gwt/client/ui/tileset4/044.png")
	public AbstractImagePrototype ts4t044();

	@Resource("revival/gwt/client/ui/tileset4/045.png")
	public AbstractImagePrototype ts4t045();

	@Resource("revival/gwt/client/ui/tileset4/046.png")
	public AbstractImagePrototype ts4t046();

	@Resource("revival/gwt/client/ui/tileset4/047.png")
	public AbstractImagePrototype ts4t047();

	@Resource("revival/gwt/client/ui/tileset4/048.png")
	public AbstractImagePrototype ts4t048();

	@Resource("revival/gwt/client/ui/tileset4/049.png")
	public AbstractImagePrototype ts4t049();

	@Resource("revival/gwt/client/ui/tileset4/050.png")
	public AbstractImagePrototype ts4t050();

	@Resource("revival/gwt/client/ui/tileset4/051.png")
	public AbstractImagePrototype ts4t051();

	@Resource("revival/gwt/client/ui/tileset4/052.png")
	public AbstractImagePrototype ts4t052();

	@Resource("revival/gwt/client/ui/tileset4/053.png")
	public AbstractImagePrototype ts4t053();

	@Resource("revival/gwt/client/ui/tileset4/054.png")
	public AbstractImagePrototype ts4t054();

	@Resource("revival/gwt/client/ui/tileset4/055.png")
	public AbstractImagePrototype ts4t055();

	@Resource("revival/gwt/client/ui/tileset4/056.png")
	public AbstractImagePrototype ts4t056();

	@Resource("revival/gwt/client/ui/tileset4/057.png")
	public AbstractImagePrototype ts4t057();

	@Resource("revival/gwt/client/ui/tileset4/058.png")
	public AbstractImagePrototype ts4t058();

	@Resource("revival/gwt/client/ui/tileset4/059.png")
	public AbstractImagePrototype ts4t059();

	@Resource("revival/gwt/client/ui/tileset4/060.png")
	public AbstractImagePrototype ts4t060();

	@Resource("revival/gwt/client/ui/tileset4/061.png")
	public AbstractImagePrototype ts4t061();

	@Resource("revival/gwt/client/ui/tileset4/062.png")
	public AbstractImagePrototype ts4t062();

	@Resource("revival/gwt/client/ui/tileset4/063.png")
	public AbstractImagePrototype ts4t063();

	@Resource("revival/gwt/client/ui/tileset4/064.png")
	public AbstractImagePrototype ts4t064();

	@Resource("revival/gwt/client/ui/tileset4/065.png")
	public AbstractImagePrototype ts4t065();

	@Resource("revival/gwt/client/ui/tileset4/066.png")
	public AbstractImagePrototype ts4t066();

	@Resource("revival/gwt/client/ui/tileset4/067.png")
	public AbstractImagePrototype ts4t067();

	@Resource("revival/gwt/client/ui/tileset4/068.png")
	public AbstractImagePrototype ts4t068();

	@Resource("revival/gwt/client/ui/tileset4/069.png")
	public AbstractImagePrototype ts4t069();

	@Resource("revival/gwt/client/ui/tileset4/070.png")
	public AbstractImagePrototype ts4t070();

	@Resource("revival/gwt/client/ui/tileset4/071.png")
	public AbstractImagePrototype ts4t071();

	@Resource("revival/gwt/client/ui/tileset4/072.png")
	public AbstractImagePrototype ts4t072();

	@Resource("revival/gwt/client/ui/tileset4/073.png")
	public AbstractImagePrototype ts4t073();

	@Resource("revival/gwt/client/ui/tileset4/074.png")
	public AbstractImagePrototype ts4t074();

	@Resource("revival/gwt/client/ui/tileset4/075.png")
	public AbstractImagePrototype ts4t075();

	@Resource("revival/gwt/client/ui/tileset4/076.png")
	public AbstractImagePrototype ts4t076();

	@Resource("revival/gwt/client/ui/tileset4/077.png")
	public AbstractImagePrototype ts4t077();

	@Resource("revival/gwt/client/ui/tileset4/078.png")
	public AbstractImagePrototype ts4t078();

	@Resource("revival/gwt/client/ui/tileset4/079.png")
	public AbstractImagePrototype ts4t079();

	@Resource("revival/gwt/client/ui/tileset4/080.png")
	public AbstractImagePrototype ts4t080();

	@Resource("revival/gwt/client/ui/tileset4/081.png")
	public AbstractImagePrototype ts4t081();

	@Resource("revival/gwt/client/ui/tileset4/082.png")
	public AbstractImagePrototype ts4t082();

	@Resource("revival/gwt/client/ui/tileset4/083.png")
	public AbstractImagePrototype ts4t083();

	@Resource("revival/gwt/client/ui/tileset4/084.png")
	public AbstractImagePrototype ts4t084();

	@Resource("revival/gwt/client/ui/tileset4/085.png")
	public AbstractImagePrototype ts4t085();

	@Resource("revival/gwt/client/ui/tileset4/086.png")
	public AbstractImagePrototype ts4t086();

	@Resource("revival/gwt/client/ui/tileset4/087.png")
	public AbstractImagePrototype ts4t087();

	@Resource("revival/gwt/client/ui/tileset4/088.png")
	public AbstractImagePrototype ts4t088();

	@Resource("revival/gwt/client/ui/tileset4/089.png")
	public AbstractImagePrototype ts4t089();

	@Resource("revival/gwt/client/ui/tileset4/090.png")
	public AbstractImagePrototype ts4t090();

	@Resource("revival/gwt/client/ui/tileset4/091.png")
	public AbstractImagePrototype ts4t091();

	@Resource("revival/gwt/client/ui/tileset4/092.png")
	public AbstractImagePrototype ts4t092();

	@Resource("revival/gwt/client/ui/tileset4/093.png")
	public AbstractImagePrototype ts4t093();

	@Resource("revival/gwt/client/ui/tileset4/094.png")
	public AbstractImagePrototype ts4t094();

	@Resource("revival/gwt/client/ui/tileset4/095.png")
	public AbstractImagePrototype ts4t095();

	@Resource("revival/gwt/client/ui/tileset4/096.png")
	public AbstractImagePrototype ts4t096();

	@Resource("revival/gwt/client/ui/tileset4/097.png")
	public AbstractImagePrototype ts4t097();

	@Resource("revival/gwt/client/ui/tileset4/098.png")
	public AbstractImagePrototype ts4t098();

	@Resource("revival/gwt/client/ui/tileset4/099.png")
	public AbstractImagePrototype ts4t099();

	@Resource("revival/gwt/client/ui/tileset4/100.png")
	public AbstractImagePrototype ts4t100();

	@Resource("revival/gwt/client/ui/tileset4/101.png")
	public AbstractImagePrototype ts4t101();

	@Resource("revival/gwt/client/ui/tileset4/102.png")
	public AbstractImagePrototype ts4t102();

	@Resource("revival/gwt/client/ui/tileset4/103.png")
	public AbstractImagePrototype ts4t103();

	@Resource("revival/gwt/client/ui/tileset4/104.png")
	public AbstractImagePrototype ts4t104();

	@Resource("revival/gwt/client/ui/tileset4/105.png")
	public AbstractImagePrototype ts4t105();

	@Resource("revival/gwt/client/ui/tileset4/106.png")
	public AbstractImagePrototype ts4t106();

	@Resource("revival/gwt/client/ui/tileset4/107.png")
	public AbstractImagePrototype ts4t107();

	@Resource("revival/gwt/client/ui/tileset4/108.png")
	public AbstractImagePrototype ts4t108();

	@Resource("revival/gwt/client/ui/tileset4/109.png")
	public AbstractImagePrototype ts4t109();

	@Resource("revival/gwt/client/ui/tileset4/110.png")
	public AbstractImagePrototype ts4t110();

	@Resource("revival/gwt/client/ui/tileset4/111.png")
	public AbstractImagePrototype ts4t111();

	@Resource("revival/gwt/client/ui/tileset4/112.png")
	public AbstractImagePrototype ts4t112();

	@Resource("revival/gwt/client/ui/tileset4/113.png")
	public AbstractImagePrototype ts4t113();

	@Resource("revival/gwt/client/ui/tileset4/114.png")
	public AbstractImagePrototype ts4t114();

	@Resource("revival/gwt/client/ui/tileset4/115.png")
	public AbstractImagePrototype ts4t115();

	@Resource("revival/gwt/client/ui/tileset4/116.png")
	public AbstractImagePrototype ts4t116();

	@Resource("revival/gwt/client/ui/tileset4/117.png")
	public AbstractImagePrototype ts4t117();

	@Resource("revival/gwt/client/ui/tileset4/118.png")
	public AbstractImagePrototype ts4t118();

	@Resource("revival/gwt/client/ui/tileset4/119.png")
	public AbstractImagePrototype ts4t119();

	@Resource("revival/gwt/client/ui/tileset4/120.png")
	public AbstractImagePrototype ts4t120();

	@Resource("revival/gwt/client/ui/tileset4/121.png")
	public AbstractImagePrototype ts4t121();

	@Resource("revival/gwt/client/ui/tileset4/122.png")
	public AbstractImagePrototype ts4t122();

	@Resource("revival/gwt/client/ui/tileset4/123.png")
	public AbstractImagePrototype ts4t123();

	@Resource("revival/gwt/client/ui/tileset4/124.png")
	public AbstractImagePrototype ts4t124();

	@Resource("revival/gwt/client/ui/tileset4/125.png")
	public AbstractImagePrototype ts4t125();

	@Resource("revival/gwt/client/ui/tileset4/126.png")
	public AbstractImagePrototype ts4t126();

	@Resource("revival/gwt/client/ui/tileset5/000.png")
	public AbstractImagePrototype ts5t000();

	@Resource("revival/gwt/client/ui/tileset5/001.png")
	public AbstractImagePrototype ts5t001();

	@Resource("revival/gwt/client/ui/tileset5/002.png")
	public AbstractImagePrototype ts5t002();

	@Resource("revival/gwt/client/ui/tileset5/003.png")
	public AbstractImagePrototype ts5t003();

	@Resource("revival/gwt/client/ui/tileset5/004.png")
	public AbstractImagePrototype ts5t004();

	@Resource("revival/gwt/client/ui/tileset5/005.png")
	public AbstractImagePrototype ts5t005();

	@Resource("revival/gwt/client/ui/tileset5/006.png")
	public AbstractImagePrototype ts5t006();

	@Resource("revival/gwt/client/ui/tileset5/007.png")
	public AbstractImagePrototype ts5t007();

	@Resource("revival/gwt/client/ui/tileset5/008.png")
	public AbstractImagePrototype ts5t008();

	@Resource("revival/gwt/client/ui/tileset5/009.png")
	public AbstractImagePrototype ts5t009();

	@Resource("revival/gwt/client/ui/tileset5/010.png")
	public AbstractImagePrototype ts5t010();

	@Resource("revival/gwt/client/ui/tileset5/011.png")
	public AbstractImagePrototype ts5t011();

	@Resource("revival/gwt/client/ui/tileset5/012.png")
	public AbstractImagePrototype ts5t012();

	@Resource("revival/gwt/client/ui/tileset5/013.png")
	public AbstractImagePrototype ts5t013();

	@Resource("revival/gwt/client/ui/tileset5/014.png")
	public AbstractImagePrototype ts5t014();

	@Resource("revival/gwt/client/ui/tileset5/015.png")
	public AbstractImagePrototype ts5t015();

	@Resource("revival/gwt/client/ui/tileset5/016.png")
	public AbstractImagePrototype ts5t016();

	@Resource("revival/gwt/client/ui/tileset5/017.png")
	public AbstractImagePrototype ts5t017();

	@Resource("revival/gwt/client/ui/tileset5/018.png")
	public AbstractImagePrototype ts5t018();

	@Resource("revival/gwt/client/ui/tileset5/019.png")
	public AbstractImagePrototype ts5t019();

	@Resource("revival/gwt/client/ui/tileset5/020.png")
	public AbstractImagePrototype ts5t020();

	@Resource("revival/gwt/client/ui/tileset5/021.png")
	public AbstractImagePrototype ts5t021();

	@Resource("revival/gwt/client/ui/tileset5/022.png")
	public AbstractImagePrototype ts5t022();

	@Resource("revival/gwt/client/ui/tileset5/023.png")
	public AbstractImagePrototype ts5t023();

	@Resource("revival/gwt/client/ui/tileset5/024.png")
	public AbstractImagePrototype ts5t024();

	@Resource("revival/gwt/client/ui/tileset5/025.png")
	public AbstractImagePrototype ts5t025();

	@Resource("revival/gwt/client/ui/tileset5/026.png")
	public AbstractImagePrototype ts5t026();

	@Resource("revival/gwt/client/ui/tileset5/027.png")
	public AbstractImagePrototype ts5t027();

	@Resource("revival/gwt/client/ui/tileset5/028.png")
	public AbstractImagePrototype ts5t028();

	@Resource("revival/gwt/client/ui/tileset5/029.png")
	public AbstractImagePrototype ts5t029();

	@Resource("revival/gwt/client/ui/tileset5/030.png")
	public AbstractImagePrototype ts5t030();

	@Resource("revival/gwt/client/ui/tileset5/031.png")
	public AbstractImagePrototype ts5t031();

	@Resource("revival/gwt/client/ui/tileset5/032.png")
	public AbstractImagePrototype ts5t032();

	@Resource("revival/gwt/client/ui/tileset5/033.png")
	public AbstractImagePrototype ts5t033();

	@Resource("revival/gwt/client/ui/tileset5/034.png")
	public AbstractImagePrototype ts5t034();

	@Resource("revival/gwt/client/ui/tileset5/035.png")
	public AbstractImagePrototype ts5t035();

	@Resource("revival/gwt/client/ui/tileset5/036.png")
	public AbstractImagePrototype ts5t036();

	@Resource("revival/gwt/client/ui/tileset5/037.png")
	public AbstractImagePrototype ts5t037();

	@Resource("revival/gwt/client/ui/tileset5/038.png")
	public AbstractImagePrototype ts5t038();

	@Resource("revival/gwt/client/ui/tileset5/039.png")
	public AbstractImagePrototype ts5t039();

	@Resource("revival/gwt/client/ui/tileset5/040.png")
	public AbstractImagePrototype ts5t040();

	@Resource("revival/gwt/client/ui/tileset5/041.png")
	public AbstractImagePrototype ts5t041();

	@Resource("revival/gwt/client/ui/tileset5/042.png")
	public AbstractImagePrototype ts5t042();

	@Resource("revival/gwt/client/ui/tileset5/043.png")
	public AbstractImagePrototype ts5t043();

	@Resource("revival/gwt/client/ui/tileset5/044.png")
	public AbstractImagePrototype ts5t044();

	@Resource("revival/gwt/client/ui/tileset5/045.png")
	public AbstractImagePrototype ts5t045();

	@Resource("revival/gwt/client/ui/tileset5/046.png")
	public AbstractImagePrototype ts5t046();

	@Resource("revival/gwt/client/ui/tileset5/047.png")
	public AbstractImagePrototype ts5t047();

	@Resource("revival/gwt/client/ui/tileset5/048.png")
	public AbstractImagePrototype ts5t048();

	@Resource("revival/gwt/client/ui/tileset5/049.png")
	public AbstractImagePrototype ts5t049();

	@Resource("revival/gwt/client/ui/tileset5/050.png")
	public AbstractImagePrototype ts5t050();

	@Resource("revival/gwt/client/ui/tileset5/051.png")
	public AbstractImagePrototype ts5t051();

	@Resource("revival/gwt/client/ui/tileset5/052.png")
	public AbstractImagePrototype ts5t052();

	@Resource("revival/gwt/client/ui/tileset5/053.png")
	public AbstractImagePrototype ts5t053();

	@Resource("revival/gwt/client/ui/tileset5/054.png")
	public AbstractImagePrototype ts5t054();

	@Resource("revival/gwt/client/ui/tileset5/055.png")
	public AbstractImagePrototype ts5t055();

	@Resource("revival/gwt/client/ui/tileset5/056.png")
	public AbstractImagePrototype ts5t056();

	@Resource("revival/gwt/client/ui/tileset5/057.png")
	public AbstractImagePrototype ts5t057();

	@Resource("revival/gwt/client/ui/tileset5/058.png")
	public AbstractImagePrototype ts5t058();

	@Resource("revival/gwt/client/ui/tileset5/059.png")
	public AbstractImagePrototype ts5t059();

	@Resource("revival/gwt/client/ui/tileset5/060.png")
	public AbstractImagePrototype ts5t060();

	@Resource("revival/gwt/client/ui/tileset5/061.png")
	public AbstractImagePrototype ts5t061();

	@Resource("revival/gwt/client/ui/tileset5/062.png")
	public AbstractImagePrototype ts5t062();

	@Resource("revival/gwt/client/ui/tileset5/063.png")
	public AbstractImagePrototype ts5t063();

	@Resource("revival/gwt/client/ui/tileset5/064.png")
	public AbstractImagePrototype ts5t064();

	@Resource("revival/gwt/client/ui/tileset5/065.png")
	public AbstractImagePrototype ts5t065();

	@Resource("revival/gwt/client/ui/tileset5/066.png")
	public AbstractImagePrototype ts5t066();

	@Resource("revival/gwt/client/ui/tileset5/067.png")
	public AbstractImagePrototype ts5t067();

	@Resource("revival/gwt/client/ui/tileset5/068.png")
	public AbstractImagePrototype ts5t068();

	@Resource("revival/gwt/client/ui/tileset5/069.png")
	public AbstractImagePrototype ts5t069();

	@Resource("revival/gwt/client/ui/tileset5/070.png")
	public AbstractImagePrototype ts5t070();

	@Resource("revival/gwt/client/ui/tileset5/071.png")
	public AbstractImagePrototype ts5t071();

	@Resource("revival/gwt/client/ui/tileset5/072.png")
	public AbstractImagePrototype ts5t072();

	@Resource("revival/gwt/client/ui/tileset5/073.png")
	public AbstractImagePrototype ts5t073();

	@Resource("revival/gwt/client/ui/tileset5/074.png")
	public AbstractImagePrototype ts5t074();

	@Resource("revival/gwt/client/ui/tileset5/075.png")
	public AbstractImagePrototype ts5t075();

	@Resource("revival/gwt/client/ui/tileset5/076.png")
	public AbstractImagePrototype ts5t076();

	@Resource("revival/gwt/client/ui/tileset5/077.png")
	public AbstractImagePrototype ts5t077();

	@Resource("revival/gwt/client/ui/tileset5/078.png")
	public AbstractImagePrototype ts5t078();

	@Resource("revival/gwt/client/ui/tileset5/079.png")
	public AbstractImagePrototype ts5t079();

	@Resource("revival/gwt/client/ui/tileset5/080.png")
	public AbstractImagePrototype ts5t080();

	@Resource("revival/gwt/client/ui/tileset5/081.png")
	public AbstractImagePrototype ts5t081();

	@Resource("revival/gwt/client/ui/tileset5/082.png")
	public AbstractImagePrototype ts5t082();

	@Resource("revival/gwt/client/ui/tileset5/083.png")
	public AbstractImagePrototype ts5t083();

	@Resource("revival/gwt/client/ui/tileset5/084.png")
	public AbstractImagePrototype ts5t084();

	@Resource("revival/gwt/client/ui/tileset5/085.png")
	public AbstractImagePrototype ts5t085();

	@Resource("revival/gwt/client/ui/tileset5/086.png")
	public AbstractImagePrototype ts5t086();

	@Resource("revival/gwt/client/ui/tileset5/087.png")
	public AbstractImagePrototype ts5t087();

	@Resource("revival/gwt/client/ui/tileset5/088.png")
	public AbstractImagePrototype ts5t088();

	@Resource("revival/gwt/client/ui/tileset5/089.png")
	public AbstractImagePrototype ts5t089();

	@Resource("revival/gwt/client/ui/tileset5/090.png")
	public AbstractImagePrototype ts5t090();

	@Resource("revival/gwt/client/ui/tileset5/091.png")
	public AbstractImagePrototype ts5t091();

	@Resource("revival/gwt/client/ui/tileset5/092.png")
	public AbstractImagePrototype ts5t092();

	@Resource("revival/gwt/client/ui/tileset5/093.png")
	public AbstractImagePrototype ts5t093();

	@Resource("revival/gwt/client/ui/tileset5/094.png")
	public AbstractImagePrototype ts5t094();

	@Resource("revival/gwt/client/ui/tileset5/095.png")
	public AbstractImagePrototype ts5t095();

	@Resource("revival/gwt/client/ui/tileset5/096.png")
	public AbstractImagePrototype ts5t096();

	@Resource("revival/gwt/client/ui/tileset5/097.png")
	public AbstractImagePrototype ts5t097();

	@Resource("revival/gwt/client/ui/tileset5/098.png")
	public AbstractImagePrototype ts5t098();

	@Resource("revival/gwt/client/ui/tileset5/099.png")
	public AbstractImagePrototype ts5t099();

	@Resource("revival/gwt/client/ui/tileset5/100.png")
	public AbstractImagePrototype ts5t100();

	@Resource("revival/gwt/client/ui/tileset5/101.png")
	public AbstractImagePrototype ts5t101();

	@Resource("revival/gwt/client/ui/tileset5/102.png")
	public AbstractImagePrototype ts5t102();

	@Resource("revival/gwt/client/ui/tileset5/103.png")
	public AbstractImagePrototype ts5t103();

	@Resource("revival/gwt/client/ui/tileset5/104.png")
	public AbstractImagePrototype ts5t104();

	@Resource("revival/gwt/client/ui/tileset5/105.png")
	public AbstractImagePrototype ts5t105();

	@Resource("revival/gwt/client/ui/tileset5/106.png")
	public AbstractImagePrototype ts5t106();

	@Resource("revival/gwt/client/ui/tileset5/107.png")
	public AbstractImagePrototype ts5t107();

	@Resource("revival/gwt/client/ui/tileset5/108.png")
	public AbstractImagePrototype ts5t108();

	@Resource("revival/gwt/client/ui/tileset5/109.png")
	public AbstractImagePrototype ts5t109();

	@Resource("revival/gwt/client/ui/tileset5/110.png")
	public AbstractImagePrototype ts5t110();

	@Resource("revival/gwt/client/ui/tileset5/111.png")
	public AbstractImagePrototype ts5t111();

	@Resource("revival/gwt/client/ui/tileset5/112.png")
	public AbstractImagePrototype ts5t112();

	@Resource("revival/gwt/client/ui/tileset5/113.png")
	public AbstractImagePrototype ts5t113();

	@Resource("revival/gwt/client/ui/tileset5/114.png")
	public AbstractImagePrototype ts5t114();

	@Resource("revival/gwt/client/ui/tileset5/115.png")
	public AbstractImagePrototype ts5t115();

	@Resource("revival/gwt/client/ui/tileset5/116.png")
	public AbstractImagePrototype ts5t116();

	@Resource("revival/gwt/client/ui/tileset5/117.png")
	public AbstractImagePrototype ts5t117();

	@Resource("revival/gwt/client/ui/tileset6/000.png")
	public AbstractImagePrototype ts6t000();

	@Resource("revival/gwt/client/ui/tileset6/001.png")
	public AbstractImagePrototype ts6t001();

	@Resource("revival/gwt/client/ui/tileset6/002.png")
	public AbstractImagePrototype ts6t002();

	@Resource("revival/gwt/client/ui/tileset6/003.png")
	public AbstractImagePrototype ts6t003();

	@Resource("revival/gwt/client/ui/tileset6/004.png")
	public AbstractImagePrototype ts6t004();

	@Resource("revival/gwt/client/ui/tileset6/005.png")
	public AbstractImagePrototype ts6t005();

	@Resource("revival/gwt/client/ui/tileset6/006.png")
	public AbstractImagePrototype ts6t006();

	@Resource("revival/gwt/client/ui/tileset6/007.png")
	public AbstractImagePrototype ts6t007();

	@Resource("revival/gwt/client/ui/tileset6/008.png")
	public AbstractImagePrototype ts6t008();

	@Resource("revival/gwt/client/ui/tileset6/009.png")
	public AbstractImagePrototype ts6t009();

	@Resource("revival/gwt/client/ui/tileset6/010.png")
	public AbstractImagePrototype ts6t010();

	@Resource("revival/gwt/client/ui/tileset6/011.png")
	public AbstractImagePrototype ts6t011();

	@Resource("revival/gwt/client/ui/tileset6/012.png")
	public AbstractImagePrototype ts6t012();

	@Resource("revival/gwt/client/ui/tileset6/013.png")
	public AbstractImagePrototype ts6t013();

	@Resource("revival/gwt/client/ui/tileset6/014.png")
	public AbstractImagePrototype ts6t014();

	@Resource("revival/gwt/client/ui/tileset6/015.png")
	public AbstractImagePrototype ts6t015();

	@Resource("revival/gwt/client/ui/tileset6/016.png")
	public AbstractImagePrototype ts6t016();

	@Resource("revival/gwt/client/ui/tileset6/017.png")
	public AbstractImagePrototype ts6t017();

	@Resource("revival/gwt/client/ui/tileset6/018.png")
	public AbstractImagePrototype ts6t018();

	@Resource("revival/gwt/client/ui/tileset6/019.png")
	public AbstractImagePrototype ts6t019();

	@Resource("revival/gwt/client/ui/tileset6/020.png")
	public AbstractImagePrototype ts6t020();

	@Resource("revival/gwt/client/ui/tileset6/021.png")
	public AbstractImagePrototype ts6t021();

	@Resource("revival/gwt/client/ui/tileset6/022.png")
	public AbstractImagePrototype ts6t022();

	@Resource("revival/gwt/client/ui/tileset6/023.png")
	public AbstractImagePrototype ts6t023();

	@Resource("revival/gwt/client/ui/tileset6/024.png")
	public AbstractImagePrototype ts6t024();

	@Resource("revival/gwt/client/ui/tileset6/025.png")
	public AbstractImagePrototype ts6t025();

	@Resource("revival/gwt/client/ui/tileset6/026.png")
	public AbstractImagePrototype ts6t026();

	@Resource("revival/gwt/client/ui/tileset6/027.png")
	public AbstractImagePrototype ts6t027();

	@Resource("revival/gwt/client/ui/tileset6/028.png")
	public AbstractImagePrototype ts6t028();

	@Resource("revival/gwt/client/ui/tileset6/029.png")
	public AbstractImagePrototype ts6t029();

	@Resource("revival/gwt/client/ui/tileset6/030.png")
	public AbstractImagePrototype ts6t030();

	@Resource("revival/gwt/client/ui/tileset6/031.png")
	public AbstractImagePrototype ts6t031();

	@Resource("revival/gwt/client/ui/tileset6/032.png")
	public AbstractImagePrototype ts6t032();

	@Resource("revival/gwt/client/ui/tileset6/033.png")
	public AbstractImagePrototype ts6t033();

	@Resource("revival/gwt/client/ui/tileset6/034.png")
	public AbstractImagePrototype ts6t034();

	@Resource("revival/gwt/client/ui/tileset6/035.png")
	public AbstractImagePrototype ts6t035();

	@Resource("revival/gwt/client/ui/tileset6/036.png")
	public AbstractImagePrototype ts6t036();

	@Resource("revival/gwt/client/ui/tileset6/037.png")
	public AbstractImagePrototype ts6t037();

	@Resource("revival/gwt/client/ui/tileset6/038.png")
	public AbstractImagePrototype ts6t038();

	@Resource("revival/gwt/client/ui/tileset6/039.png")
	public AbstractImagePrototype ts6t039();

	@Resource("revival/gwt/client/ui/tileset6/040.png")
	public AbstractImagePrototype ts6t040();

	@Resource("revival/gwt/client/ui/tileset6/041.png")
	public AbstractImagePrototype ts6t041();

	@Resource("revival/gwt/client/ui/tileset6/042.png")
	public AbstractImagePrototype ts6t042();

	@Resource("revival/gwt/client/ui/tileset6/043.png")
	public AbstractImagePrototype ts6t043();

	@Resource("revival/gwt/client/ui/tileset6/044.png")
	public AbstractImagePrototype ts6t044();

	@Resource("revival/gwt/client/ui/tileset6/045.png")
	public AbstractImagePrototype ts6t045();

	@Resource("revival/gwt/client/ui/tileset6/046.png")
	public AbstractImagePrototype ts6t046();

	@Resource("revival/gwt/client/ui/tileset6/047.png")
	public AbstractImagePrototype ts6t047();

	@Resource("revival/gwt/client/ui/tileset6/048.png")
	public AbstractImagePrototype ts6t048();

	@Resource("revival/gwt/client/ui/tileset6/049.png")
	public AbstractImagePrototype ts6t049();

	@Resource("revival/gwt/client/ui/tileset6/050.png")
	public AbstractImagePrototype ts6t050();

	@Resource("revival/gwt/client/ui/tileset6/051.png")
	public AbstractImagePrototype ts6t051();

	@Resource("revival/gwt/client/ui/tileset6/052.png")
	public AbstractImagePrototype ts6t052();

	@Resource("revival/gwt/client/ui/tileset6/053.png")
	public AbstractImagePrototype ts6t053();

	@Resource("revival/gwt/client/ui/tileset6/054.png")
	public AbstractImagePrototype ts6t054();

	@Resource("revival/gwt/client/ui/tileset6/055.png")
	public AbstractImagePrototype ts6t055();

	@Resource("revival/gwt/client/ui/tileset6/056.png")
	public AbstractImagePrototype ts6t056();

	@Resource("revival/gwt/client/ui/tileset6/057.png")
	public AbstractImagePrototype ts6t057();

	@Resource("revival/gwt/client/ui/tileset6/058.png")
	public AbstractImagePrototype ts6t058();

	@Resource("revival/gwt/client/ui/tileset6/059.png")
	public AbstractImagePrototype ts6t059();

	@Resource("revival/gwt/client/ui/tileset6/060.png")
	public AbstractImagePrototype ts6t060();

	@Resource("revival/gwt/client/ui/tileset6/061.png")
	public AbstractImagePrototype ts6t061();

	@Resource("revival/gwt/client/ui/tileset6/062.png")
	public AbstractImagePrototype ts6t062();

	@Resource("revival/gwt/client/ui/tileset6/063.png")
	public AbstractImagePrototype ts6t063();

	@Resource("revival/gwt/client/ui/tileset6/064.png")
	public AbstractImagePrototype ts6t064();

	@Resource("revival/gwt/client/ui/tileset6/065.png")
	public AbstractImagePrototype ts6t065();

	@Resource("revival/gwt/client/ui/tileset6/066.png")
	public AbstractImagePrototype ts6t066();

	@Resource("revival/gwt/client/ui/tileset6/067.png")
	public AbstractImagePrototype ts6t067();

	@Resource("revival/gwt/client/ui/tileset6/068.png")
	public AbstractImagePrototype ts6t068();

	@Resource("revival/gwt/client/ui/tileset6/069.png")
	public AbstractImagePrototype ts6t069();

	@Resource("revival/gwt/client/ui/tileset6/070.png")
	public AbstractImagePrototype ts6t070();

	@Resource("revival/gwt/client/ui/tileset6/071.png")
	public AbstractImagePrototype ts6t071();

	@Resource("revival/gwt/client/ui/tileset6/072.png")
	public AbstractImagePrototype ts6t072();

	@Resource("revival/gwt/client/ui/tileset6/073.png")
	public AbstractImagePrototype ts6t073();

	@Resource("revival/gwt/client/ui/tileset6/074.png")
	public AbstractImagePrototype ts6t074();

	@Resource("revival/gwt/client/ui/tileset6/075.png")
	public AbstractImagePrototype ts6t075();

	@Resource("revival/gwt/client/ui/tileset6/076.png")
	public AbstractImagePrototype ts6t076();

	@Resource("revival/gwt/client/ui/tileset6/077.png")
	public AbstractImagePrototype ts6t077();

	@Resource("revival/gwt/client/ui/tileset6/078.png")
	public AbstractImagePrototype ts6t078();

	@Resource("revival/gwt/client/ui/tileset6/079.png")
	public AbstractImagePrototype ts6t079();

	@Resource("revival/gwt/client/ui/tileset6/080.png")
	public AbstractImagePrototype ts6t080();

	@Resource("revival/gwt/client/ui/tileset6/081.png")
	public AbstractImagePrototype ts6t081();

	@Resource("revival/gwt/client/ui/tileset6/082.png")
	public AbstractImagePrototype ts6t082();

	@Resource("revival/gwt/client/ui/tileset6/083.png")
	public AbstractImagePrototype ts6t083();

	@Resource("revival/gwt/client/ui/tileset6/084.png")
	public AbstractImagePrototype ts6t084();

	@Resource("revival/gwt/client/ui/tileset6/085.png")
	public AbstractImagePrototype ts6t085();

	@Resource("revival/gwt/client/ui/tileset6/086.png")
	public AbstractImagePrototype ts6t086();

	@Resource("revival/gwt/client/ui/tileset6/087.png")
	public AbstractImagePrototype ts6t087();

	@Resource("revival/gwt/client/ui/tileset6/088.png")
	public AbstractImagePrototype ts6t088();

	@Resource("revival/gwt/client/ui/tileset6/089.png")
	public AbstractImagePrototype ts6t089();

	@Resource("revival/gwt/client/ui/tileset7/000.png")
	public AbstractImagePrototype ts7t000();

	@Resource("revival/gwt/client/ui/tileset7/001.png")
	public AbstractImagePrototype ts7t001();

	@Resource("revival/gwt/client/ui/tileset7/002.png")
	public AbstractImagePrototype ts7t002();

	@Resource("revival/gwt/client/ui/tileset7/003.png")
	public AbstractImagePrototype ts7t003();

	@Resource("revival/gwt/client/ui/tileset7/004.png")
	public AbstractImagePrototype ts7t004();

	@Resource("revival/gwt/client/ui/tileset7/005.png")
	public AbstractImagePrototype ts7t005();

	@Resource("revival/gwt/client/ui/tileset7/006.png")
	public AbstractImagePrototype ts7t006();

	@Resource("revival/gwt/client/ui/tileset7/007.png")
	public AbstractImagePrototype ts7t007();

	@Resource("revival/gwt/client/ui/tileset7/008.png")
	public AbstractImagePrototype ts7t008();

	@Resource("revival/gwt/client/ui/tileset7/009.png")
	public AbstractImagePrototype ts7t009();

	@Resource("revival/gwt/client/ui/tileset7/010.png")
	public AbstractImagePrototype ts7t010();

	@Resource("revival/gwt/client/ui/tileset7/011.png")
	public AbstractImagePrototype ts7t011();

	@Resource("revival/gwt/client/ui/tileset7/012.png")
	public AbstractImagePrototype ts7t012();

	@Resource("revival/gwt/client/ui/tileset7/013.png")
	public AbstractImagePrototype ts7t013();

	@Resource("revival/gwt/client/ui/tileset7/014.png")
	public AbstractImagePrototype ts7t014();

	@Resource("revival/gwt/client/ui/tileset7/015.png")
	public AbstractImagePrototype ts7t015();

	@Resource("revival/gwt/client/ui/tileset7/016.png")
	public AbstractImagePrototype ts7t016();

	@Resource("revival/gwt/client/ui/tileset7/017.png")
	public AbstractImagePrototype ts7t017();

	@Resource("revival/gwt/client/ui/tileset7/018.png")
	public AbstractImagePrototype ts7t018();

	@Resource("revival/gwt/client/ui/tileset7/019.png")
	public AbstractImagePrototype ts7t019();

	@Resource("revival/gwt/client/ui/tileset7/020.png")
	public AbstractImagePrototype ts7t020();

	@Resource("revival/gwt/client/ui/tileset7/021.png")
	public AbstractImagePrototype ts7t021();

	@Resource("revival/gwt/client/ui/tileset7/022.png")
	public AbstractImagePrototype ts7t022();

	@Resource("revival/gwt/client/ui/tileset7/023.png")
	public AbstractImagePrototype ts7t023();

	@Resource("revival/gwt/client/ui/tileset7/024.png")
	public AbstractImagePrototype ts7t024();

	@Resource("revival/gwt/client/ui/tileset7/025.png")
	public AbstractImagePrototype ts7t025();

	@Resource("revival/gwt/client/ui/tileset7/026.png")
	public AbstractImagePrototype ts7t026();

	@Resource("revival/gwt/client/ui/tileset7/027.png")
	public AbstractImagePrototype ts7t027();

	@Resource("revival/gwt/client/ui/tileset7/028.png")
	public AbstractImagePrototype ts7t028();

	@Resource("revival/gwt/client/ui/tileset7/029.png")
	public AbstractImagePrototype ts7t029();

	@Resource("revival/gwt/client/ui/tileset7/030.png")
	public AbstractImagePrototype ts7t030();

	@Resource("revival/gwt/client/ui/tileset7/031.png")
	public AbstractImagePrototype ts7t031();

	@Resource("revival/gwt/client/ui/tileset7/032.png")
	public AbstractImagePrototype ts7t032();

	@Resource("revival/gwt/client/ui/tileset7/033.png")
	public AbstractImagePrototype ts7t033();

	@Resource("revival/gwt/client/ui/tileset7/034.png")
	public AbstractImagePrototype ts7t034();

	@Resource("revival/gwt/client/ui/tileset7/035.png")
	public AbstractImagePrototype ts7t035();

	@Resource("revival/gwt/client/ui/tileset7/036.png")
	public AbstractImagePrototype ts7t036();

	@Resource("revival/gwt/client/ui/tileset7/037.png")
	public AbstractImagePrototype ts7t037();

	@Resource("revival/gwt/client/ui/tileset7/038.png")
	public AbstractImagePrototype ts7t038();

	@Resource("revival/gwt/client/ui/tileset7/039.png")
	public AbstractImagePrototype ts7t039();

	@Resource("revival/gwt/client/ui/tileset7/040.png")
	public AbstractImagePrototype ts7t040();

	@Resource("revival/gwt/client/ui/tileset7/041.png")
	public AbstractImagePrototype ts7t041();

	@Resource("revival/gwt/client/ui/tileset7/042.png")
	public AbstractImagePrototype ts7t042();

	@Resource("revival/gwt/client/ui/tileset7/043.png")
	public AbstractImagePrototype ts7t043();

	@Resource("revival/gwt/client/ui/tileset7/044.png")
	public AbstractImagePrototype ts7t044();

	@Resource("revival/gwt/client/ui/tileset7/045.png")
	public AbstractImagePrototype ts7t045();

	@Resource("revival/gwt/client/ui/tileset7/046.png")
	public AbstractImagePrototype ts7t046();

	@Resource("revival/gwt/client/ui/tileset7/047.png")
	public AbstractImagePrototype ts7t047();

	@Resource("revival/gwt/client/ui/tileset7/048.png")
	public AbstractImagePrototype ts7t048();

	@Resource("revival/gwt/client/ui/tileset7/049.png")
	public AbstractImagePrototype ts7t049();

	@Resource("revival/gwt/client/ui/tileset7/050.png")
	public AbstractImagePrototype ts7t050();

	@Resource("revival/gwt/client/ui/tileset7/051.png")
	public AbstractImagePrototype ts7t051();

	@Resource("revival/gwt/client/ui/tileset7/052.png")
	public AbstractImagePrototype ts7t052();

	@Resource("revival/gwt/client/ui/tileset7/053.png")
	public AbstractImagePrototype ts7t053();

	@Resource("revival/gwt/client/ui/tileset7/054.png")
	public AbstractImagePrototype ts7t054();

	@Resource("revival/gwt/client/ui/tileset7/055.png")
	public AbstractImagePrototype ts7t055();

	@Resource("revival/gwt/client/ui/tileset7/056.png")
	public AbstractImagePrototype ts7t056();

	@Resource("revival/gwt/client/ui/tileset7/057.png")
	public AbstractImagePrototype ts7t057();

	@Resource("revival/gwt/client/ui/tileset7/058.png")
	public AbstractImagePrototype ts7t058();

	@Resource("revival/gwt/client/ui/tileset7/059.png")
	public AbstractImagePrototype ts7t059();

	@Resource("revival/gwt/client/ui/tileset7/060.png")
	public AbstractImagePrototype ts7t060();

	@Resource("revival/gwt/client/ui/tileset7/061.png")
	public AbstractImagePrototype ts7t061();

	@Resource("revival/gwt/client/ui/tileset7/062.png")
	public AbstractImagePrototype ts7t062();

	@Resource("revival/gwt/client/ui/tileset7/063.png")
	public AbstractImagePrototype ts7t063();

	@Resource("revival/gwt/client/ui/tileset7/064.png")
	public AbstractImagePrototype ts7t064();

	@Resource("revival/gwt/client/ui/tileset7/065.png")
	public AbstractImagePrototype ts7t065();

	@Resource("revival/gwt/client/ui/tileset7/066.png")
	public AbstractImagePrototype ts7t066();

	@Resource("revival/gwt/client/ui/tileset7/067.png")
	public AbstractImagePrototype ts7t067();

	@Resource("revival/gwt/client/ui/tileset7/068.png")
	public AbstractImagePrototype ts7t068();

	@Resource("revival/gwt/client/ui/tileset7/069.png")
	public AbstractImagePrototype ts7t069();

	@Resource("revival/gwt/client/ui/tileset7/070.png")
	public AbstractImagePrototype ts7t070();

	@Resource("revival/gwt/client/ui/tileset7/071.png")
	public AbstractImagePrototype ts7t071();

	@Resource("revival/gwt/client/ui/tileset7/072.png")
	public AbstractImagePrototype ts7t072();

	@Resource("revival/gwt/client/ui/tileset7/073.png")
	public AbstractImagePrototype ts7t073();

	@Resource("revival/gwt/client/ui/tileset7/074.png")
	public AbstractImagePrototype ts7t074();

	@Resource("revival/gwt/client/ui/tileset7/075.png")
	public AbstractImagePrototype ts7t075();

	@Resource("revival/gwt/client/ui/tileset7/076.png")
	public AbstractImagePrototype ts7t076();

	@Resource("revival/gwt/client/ui/tileset7/077.png")
	public AbstractImagePrototype ts7t077();

	@Resource("revival/gwt/client/ui/tileset7/078.png")
	public AbstractImagePrototype ts7t078();

	@Resource("revival/gwt/client/ui/tileset7/079.png")
	public AbstractImagePrototype ts7t079();

	@Resource("revival/gwt/client/ui/tileset7/080.png")
	public AbstractImagePrototype ts7t080();

	@Resource("revival/gwt/client/ui/tileset7/081.png")
	public AbstractImagePrototype ts7t081();

	@Resource("revival/gwt/client/ui/tileset7/082.png")
	public AbstractImagePrototype ts7t082();

	@Resource("revival/gwt/client/ui/tileset7/083.png")
	public AbstractImagePrototype ts7t083();

	@Resource("revival/gwt/client/ui/tileset7/084.png")
	public AbstractImagePrototype ts7t084();

	@Resource("revival/gwt/client/ui/tileset7/085.png")
	public AbstractImagePrototype ts7t085();

	@Resource("revival/gwt/client/ui/tileset7/086.png")
	public AbstractImagePrototype ts7t086();

	@Resource("revival/gwt/client/ui/tileset7/087.png")
	public AbstractImagePrototype ts7t087();

	@Resource("revival/gwt/client/ui/tileset7/088.png")
	public AbstractImagePrototype ts7t088();

	@Resource("revival/gwt/client/ui/tileset7/089.png")
	public AbstractImagePrototype ts7t089();

	@Resource("revival/gwt/client/ui/tileset7/090.png")
	public AbstractImagePrototype ts7t090();

	@Resource("revival/gwt/client/ui/tileset7/091.png")
	public AbstractImagePrototype ts7t091();

	@Resource("revival/gwt/client/ui/tileset7/092.png")
	public AbstractImagePrototype ts7t092();

	@Resource("revival/gwt/client/ui/tileset7/093.png")
	public AbstractImagePrototype ts7t093();

	@Resource("revival/gwt/client/ui/tileset7/094.png")
	public AbstractImagePrototype ts7t094();

	@Resource("revival/gwt/client/ui/tileset7/095.png")
	public AbstractImagePrototype ts7t095();

	@Resource("revival/gwt/client/ui/tileset7/096.png")
	public AbstractImagePrototype ts7t096();

	@Resource("revival/gwt/client/ui/tileset7/097.png")
	public AbstractImagePrototype ts7t097();

	@Resource("revival/gwt/client/ui/tileset7/098.png")
	public AbstractImagePrototype ts7t098();

	@Resource("revival/gwt/client/ui/tileset7/099.png")
	public AbstractImagePrototype ts7t099();

	@Resource("revival/gwt/client/ui/tileset7/100.png")
	public AbstractImagePrototype ts7t100();

	@Resource("revival/gwt/client/ui/tileset7/101.png")
	public AbstractImagePrototype ts7t101();

	@Resource("revival/gwt/client/ui/tileset7/102.png")
	public AbstractImagePrototype ts7t102();

	@Resource("revival/gwt/client/ui/tileset7/103.png")
	public AbstractImagePrototype ts7t103();

	@Resource("revival/gwt/client/ui/tileset8/000.png")
	public AbstractImagePrototype ts8t000();

	@Resource("revival/gwt/client/ui/tileset8/001.png")
	public AbstractImagePrototype ts8t001();

	@Resource("revival/gwt/client/ui/tileset8/002.png")
	public AbstractImagePrototype ts8t002();

	@Resource("revival/gwt/client/ui/tileset8/003.png")
	public AbstractImagePrototype ts8t003();

	@Resource("revival/gwt/client/ui/tileset8/004.png")
	public AbstractImagePrototype ts8t004();

	@Resource("revival/gwt/client/ui/tileset8/005.png")
	public AbstractImagePrototype ts8t005();

	@Resource("revival/gwt/client/ui/tileset8/006.png")
	public AbstractImagePrototype ts8t006();

	@Resource("revival/gwt/client/ui/tileset8/007.png")
	public AbstractImagePrototype ts8t007();

	@Resource("revival/gwt/client/ui/tileset8/008.png")
	public AbstractImagePrototype ts8t008();

	@Resource("revival/gwt/client/ui/tileset8/009.png")
	public AbstractImagePrototype ts8t009();

	@Resource("revival/gwt/client/ui/tileset8/010.png")
	public AbstractImagePrototype ts8t010();

	@Resource("revival/gwt/client/ui/tileset8/011.png")
	public AbstractImagePrototype ts8t011();

	@Resource("revival/gwt/client/ui/tileset8/012.png")
	public AbstractImagePrototype ts8t012();

	@Resource("revival/gwt/client/ui/tileset8/013.png")
	public AbstractImagePrototype ts8t013();

	@Resource("revival/gwt/client/ui/tileset8/014.png")
	public AbstractImagePrototype ts8t014();

	@Resource("revival/gwt/client/ui/tileset8/015.png")
	public AbstractImagePrototype ts8t015();

	@Resource("revival/gwt/client/ui/tileset8/016.png")
	public AbstractImagePrototype ts8t016();

	@Resource("revival/gwt/client/ui/tileset8/017.png")
	public AbstractImagePrototype ts8t017();

	@Resource("revival/gwt/client/ui/tileset8/018.png")
	public AbstractImagePrototype ts8t018();

	@Resource("revival/gwt/client/ui/tileset8/019.png")
	public AbstractImagePrototype ts8t019();

	@Resource("revival/gwt/client/ui/tileset8/020.png")
	public AbstractImagePrototype ts8t020();

	@Resource("revival/gwt/client/ui/tileset8/021.png")
	public AbstractImagePrototype ts8t021();

	@Resource("revival/gwt/client/ui/tileset8/022.png")
	public AbstractImagePrototype ts8t022();

	@Resource("revival/gwt/client/ui/tileset8/023.png")
	public AbstractImagePrototype ts8t023();

	@Resource("revival/gwt/client/ui/tileset8/024.png")
	public AbstractImagePrototype ts8t024();

	@Resource("revival/gwt/client/ui/tileset8/025.png")
	public AbstractImagePrototype ts8t025();

	@Resource("revival/gwt/client/ui/tileset8/026.png")
	public AbstractImagePrototype ts8t026();

	@Resource("revival/gwt/client/ui/tileset8/027.png")
	public AbstractImagePrototype ts8t027();

	@Resource("revival/gwt/client/ui/tileset8/028.png")
	public AbstractImagePrototype ts8t028();

	@Resource("revival/gwt/client/ui/tileset8/029.png")
	public AbstractImagePrototype ts8t029();

	@Resource("revival/gwt/client/ui/tileset8/030.png")
	public AbstractImagePrototype ts8t030();

	@Resource("revival/gwt/client/ui/tileset8/031.png")
	public AbstractImagePrototype ts8t031();

	@Resource("revival/gwt/client/ui/tileset8/032.png")
	public AbstractImagePrototype ts8t032();

	@Resource("revival/gwt/client/ui/tileset8/033.png")
	public AbstractImagePrototype ts8t033();

	@Resource("revival/gwt/client/ui/tileset8/034.png")
	public AbstractImagePrototype ts8t034();

	@Resource("revival/gwt/client/ui/tileset8/035.png")
	public AbstractImagePrototype ts8t035();

	@Resource("revival/gwt/client/ui/tileset8/036.png")
	public AbstractImagePrototype ts8t036();

	@Resource("revival/gwt/client/ui/tileset8/037.png")
	public AbstractImagePrototype ts8t037();

	@Resource("revival/gwt/client/ui/tileset8/038.png")
	public AbstractImagePrototype ts8t038();

	@Resource("revival/gwt/client/ui/tileset8/039.png")
	public AbstractImagePrototype ts8t039();

	@Resource("revival/gwt/client/ui/tileset8/040.png")
	public AbstractImagePrototype ts8t040();

	@Resource("revival/gwt/client/ui/tileset8/041.png")
	public AbstractImagePrototype ts8t041();

	@Resource("revival/gwt/client/ui/tileset8/042.png")
	public AbstractImagePrototype ts8t042();

	@Resource("revival/gwt/client/ui/tileset8/043.png")
	public AbstractImagePrototype ts8t043();

	@Resource("revival/gwt/client/ui/tileset8/044.png")
	public AbstractImagePrototype ts8t044();

	@Resource("revival/gwt/client/ui/tileset8/045.png")
	public AbstractImagePrototype ts8t045();

	@Resource("revival/gwt/client/ui/tileset8/046.png")
	public AbstractImagePrototype ts8t046();

	@Resource("revival/gwt/client/ui/tileset8/047.png")
	public AbstractImagePrototype ts8t047();

	@Resource("revival/gwt/client/ui/tileset8/048.png")
	public AbstractImagePrototype ts8t048();

	@Resource("revival/gwt/client/ui/tileset8/049.png")
	public AbstractImagePrototype ts8t049();

	@Resource("revival/gwt/client/ui/tileset8/050.png")
	public AbstractImagePrototype ts8t050();

	@Resource("revival/gwt/client/ui/tileset8/051.png")
	public AbstractImagePrototype ts8t051();

	@Resource("revival/gwt/client/ui/tileset8/052.png")
	public AbstractImagePrototype ts8t052();

	@Resource("revival/gwt/client/ui/tileset8/053.png")
	public AbstractImagePrototype ts8t053();

	@Resource("revival/gwt/client/ui/tileset8/054.png")
	public AbstractImagePrototype ts8t054();

	@Resource("revival/gwt/client/ui/tileset8/055.png")
	public AbstractImagePrototype ts8t055();

	@Resource("revival/gwt/client/ui/tileset8/056.png")
	public AbstractImagePrototype ts8t056();

	@Resource("revival/gwt/client/ui/tileset8/057.png")
	public AbstractImagePrototype ts8t057();

	@Resource("revival/gwt/client/ui/tileset8/058.png")
	public AbstractImagePrototype ts8t058();

	@Resource("revival/gwt/client/ui/tileset8/059.png")
	public AbstractImagePrototype ts8t059();

	@Resource("revival/gwt/client/ui/tileset8/060.png")
	public AbstractImagePrototype ts8t060();

	@Resource("revival/gwt/client/ui/tileset8/061.png")
	public AbstractImagePrototype ts8t061();

	@Resource("revival/gwt/client/ui/tileset8/062.png")
	public AbstractImagePrototype ts8t062();

	@Resource("revival/gwt/client/ui/tileset8/063.png")
	public AbstractImagePrototype ts8t063();

	@Resource("revival/gwt/client/ui/tileset8/064.png")
	public AbstractImagePrototype ts8t064();

	@Resource("revival/gwt/client/ui/tileset8/065.png")
	public AbstractImagePrototype ts8t065();

	@Resource("revival/gwt/client/ui/tileset8/066.png")
	public AbstractImagePrototype ts8t066();

	@Resource("revival/gwt/client/ui/tileset8/067.png")
	public AbstractImagePrototype ts8t067();

	@Resource("revival/gwt/client/ui/tileset8/068.png")
	public AbstractImagePrototype ts8t068();

	@Resource("revival/gwt/client/ui/tileset8/069.png")
	public AbstractImagePrototype ts8t069();

	@Resource("revival/gwt/client/ui/tileset8/070.png")
	public AbstractImagePrototype ts8t070();

	@Resource("revival/gwt/client/ui/tileset8/071.png")
	public AbstractImagePrototype ts8t071();

	@Resource("revival/gwt/client/ui/tileset8/072.png")
	public AbstractImagePrototype ts8t072();

	@Resource("revival/gwt/client/ui/tileset8/073.png")
	public AbstractImagePrototype ts8t073();

	@Resource("revival/gwt/client/ui/tileset8/074.png")
	public AbstractImagePrototype ts8t074();

	@Resource("revival/gwt/client/ui/tileset8/075.png")
	public AbstractImagePrototype ts8t075();

	@Resource("revival/gwt/client/ui/tileset8/076.png")
	public AbstractImagePrototype ts8t076();

	@Resource("revival/gwt/client/ui/tileset8/077.png")
	public AbstractImagePrototype ts8t077();

	@Resource("revival/gwt/client/ui/tileset8/078.png")
	public AbstractImagePrototype ts8t078();

	@Resource("revival/gwt/client/ui/tileset8/079.png")
	public AbstractImagePrototype ts8t079();

	@Resource("revival/gwt/client/ui/tileset8/080.png")
	public AbstractImagePrototype ts8t080();

	@Resource("revival/gwt/client/ui/tileset8/081.png")
	public AbstractImagePrototype ts8t081();

	@Resource("revival/gwt/client/ui/tileset8/082.png")
	public AbstractImagePrototype ts8t082();

	@Resource("revival/gwt/client/ui/tileset8/083.png")
	public AbstractImagePrototype ts8t083();

	@Resource("revival/gwt/client/ui/tileset8/084.png")
	public AbstractImagePrototype ts8t084();

	@Resource("revival/gwt/client/ui/tileset8/085.png")
	public AbstractImagePrototype ts8t085();

	@Resource("revival/gwt/client/ui/tileset8/086.png")
	public AbstractImagePrototype ts8t086();

	@Resource("revival/gwt/client/ui/tileset8/087.png")
	public AbstractImagePrototype ts8t087();

	@Resource("revival/gwt/client/ui/tileset8/088.png")
	public AbstractImagePrototype ts8t088();

	@Resource("revival/gwt/client/ui/tileset8/089.png")
	public AbstractImagePrototype ts8t089();

	@Resource("revival/gwt/client/ui/tileset8/090.png")
	public AbstractImagePrototype ts8t090();

	@Resource("revival/gwt/client/ui/tileset8/091.png")
	public AbstractImagePrototype ts8t091();

	@Resource("revival/gwt/client/ui/tileset8/092.png")
	public AbstractImagePrototype ts8t092();

	@Resource("revival/gwt/client/ui/tileset8/093.png")
	public AbstractImagePrototype ts8t093();

	@Resource("revival/gwt/client/ui/tileset8/094.png")
	public AbstractImagePrototype ts8t094();

	@Resource("revival/gwt/client/ui/tileset8/095.png")
	public AbstractImagePrototype ts8t095();

	@Resource("revival/gwt/client/ui/tileset8/096.png")
	public AbstractImagePrototype ts8t096();

	@Resource("revival/gwt/client/ui/tileset8/097.png")
	public AbstractImagePrototype ts8t097();

	@Resource("revival/gwt/client/ui/tileset8/098.png")
	public AbstractImagePrototype ts8t098();

	@Resource("revival/gwt/client/ui/tileset8/099.png")
	public AbstractImagePrototype ts8t099();

	@Resource("revival/gwt/client/ui/tileset8/100.png")
	public AbstractImagePrototype ts8t100();

	@Resource("revival/gwt/client/ui/tileset8/101.png")
	public AbstractImagePrototype ts8t101();

	@Resource("revival/gwt/client/ui/tileset8/102.png")
	public AbstractImagePrototype ts8t102();

	@Resource("revival/gwt/client/ui/tileset8/103.png")
	public AbstractImagePrototype ts8t103();

	@Resource("revival/gwt/client/ui/tileset8/104.png")
	public AbstractImagePrototype ts8t104();

	@Resource("revival/gwt/client/ui/tileset8/105.png")
	public AbstractImagePrototype ts8t105();

	@Resource("revival/gwt/client/ui/tileset8/106.png")
	public AbstractImagePrototype ts8t106();

	@Resource("revival/gwt/client/ui/tileset8/107.png")
	public AbstractImagePrototype ts8t107();

	@Resource("revival/gwt/client/ui/tileset8/108.png")
	public AbstractImagePrototype ts8t108();

	@Resource("revival/gwt/client/ui/tileset8/109.png")
	public AbstractImagePrototype ts8t109();

	@Resource("revival/gwt/client/ui/tileset8/110.png")
	public AbstractImagePrototype ts8t110();

	@Resource("revival/gwt/client/ui/tileset8/111.png")
	public AbstractImagePrototype ts8t111();

	@Resource("revival/gwt/client/ui/tileset8/112.png")
	public AbstractImagePrototype ts8t112();

	@Resource("revival/gwt/client/ui/tileset8/113.png")
	public AbstractImagePrototype ts8t113();

	@Resource("revival/gwt/client/ui/tileset8/114.png")
	public AbstractImagePrototype ts8t114();

	@Resource("revival/gwt/client/ui/tileset8/115.png")
	public AbstractImagePrototype ts8t115();

	@Resource("revival/gwt/client/ui/tileset8/116.png")
	public AbstractImagePrototype ts8t116();

	@Resource("revival/gwt/client/ui/tileset8/117.png")
	public AbstractImagePrototype ts8t117();

	@Resource("revival/gwt/client/ui/tileset8/118.png")
	public AbstractImagePrototype ts8t118();

	@Resource("revival/gwt/client/ui/tileset8/119.png")
	public AbstractImagePrototype ts8t119();

	@Resource("revival/gwt/client/ui/tileset8/120.png")
	public AbstractImagePrototype ts8t120();

	@Resource("revival/gwt/client/ui/tileset8/121.png")
	public AbstractImagePrototype ts8t121();

	@Resource("revival/gwt/client/ui/tileset8/122.png")
	public AbstractImagePrototype ts8t122();

	@Resource("revival/gwt/client/ui/tileset8/123.png")
	public AbstractImagePrototype ts8t123();

	@Resource("revival/gwt/client/ui/tileset8/124.png")
	public AbstractImagePrototype ts8t124();

	@Resource("revival/gwt/client/ui/tileset8/125.png")
	public AbstractImagePrototype ts8t125();

	@Resource("revival/gwt/client/ui/tileset8/126.png")
	public AbstractImagePrototype ts8t126();

	@Resource("revival/gwt/client/ui/tileset8/127.png")
	public AbstractImagePrototype ts8t127();

	@Resource("revival/gwt/client/ui/tileset8/128.png")
	public AbstractImagePrototype ts8t128();

	@Resource("revival/gwt/client/ui/tileset8/129.png")
	public AbstractImagePrototype ts8t129();

	@Resource("revival/gwt/client/ui/tileset8/130.png")
	public AbstractImagePrototype ts8t130();

	@Resource("revival/gwt/client/ui/tileset8/131.png")
	public AbstractImagePrototype ts8t131();

	@Resource("revival/gwt/client/ui/tileset8/132.png")
	public AbstractImagePrototype ts8t132();

	@Resource("revival/gwt/client/ui/tileset8/133.png")
	public AbstractImagePrototype ts8t133();

	@Resource("revival/gwt/client/ui/tileset8/134.png")
	public AbstractImagePrototype ts8t134();
*/
}
