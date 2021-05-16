package revival.gwt.client.ui;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


import com.allen_sauer.gwt.log.client.Log;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.ui.AbstractImagePrototype;

public class ImageHolder {

	private static List<Map<Integer, AbstractImagePrototype>> imageList = new ArrayList<Map<Integer, AbstractImagePrototype>>();
	private static Images images = (Images)GWT.create(Images.class);
	
	public static AbstractImagePrototype get(int tsNr, int tileNr) {
		try {
			return imageList.get(tsNr).get(tileNr);
		} catch (NullPointerException e) {
			Log.error("unable to find tile " + tileNr + " in tileset " + tsNr);
			return null;
		}
	}
	/*
	static {
		for (int ts=0;ts<9;ts++) {
			imageList.add(new HashMap<Integer, AbstractImagePrototype>());
		}
		
		Map<Integer, AbstractImagePrototype> list = imageList.get(0);
		list.put(0, images.ts0t000());
		list.put(1, images.ts0t001());
		list.put(2, images.ts0t002());
		list.put(3, images.ts0t003());
		list.put(4, images.ts0t004());
		list.put(5, images.ts0t005());
		list.put(6, images.ts0t006());
		list.put(7, images.ts0t007());
		list.put(8, images.ts0t008());
		list.put(9, images.ts0t009());
		list.put(10, images.ts0t010());
		list.put(11, images.ts0t011());
		list.put(12, images.ts0t012());
		list.put(13, images.ts0t013());
		list.put(14, images.ts0t014());
		list.put(15, images.ts0t015());
		list.put(16, images.ts0t016());
		list.put(17, images.ts0t017());
		list.put(18, images.ts0t018());
		list.put(19, images.ts0t019());
		list.put(20, images.ts0t020());
		list.put(21, images.ts0t021());
		list.put(22, images.ts0t022());
		list.put(23, images.ts0t023());
		list.put(24, images.ts0t024());
		list.put(25, images.ts0t025());
		list.put(26, images.ts0t026());
		list.put(27, images.ts0t027());
		list.put(28, images.ts0t028());
		list.put(29, images.ts0t029());
		list.put(30, images.ts0t030());
		list.put(31, images.ts0t031());
		list.put(32, images.ts0t032());
		list.put(33, images.ts0t033());
		list.put(34, images.ts0t034());
		list.put(35, images.ts0t035());
		list.put(36, images.ts0t036());
		list.put(37, images.ts0t037());
		list.put(38, images.ts0t038());
		list.put(39, images.ts0t039());
		list.put(40, images.ts0t040());
		list.put(41, images.ts0t041());
		list.put(42, images.ts0t042());
		list.put(43, images.ts0t043());
		list.put(44, images.ts0t044());
		list.put(45, images.ts0t045());
		list.put(46, images.ts0t046());
		list.put(47, images.ts0t047());
		list.put(48, images.ts0t048());
		list.put(49, images.ts0t049());
		list.put(50, images.ts0t050());
		list.put(51, images.ts0t051());
		list.put(52, images.ts0t052());
		list.put(53, images.ts0t053());
		list.put(54, images.ts0t054());
		list.put(55, images.ts0t055());
		list.put(56, images.ts0t056());
		list.put(57, images.ts0t057());
		list.put(58, images.ts0t058());
		list.put(59, images.ts0t059());
		list.put(60, images.ts0t060());
		list.put(61, images.ts0t061());
		list.put(62, images.ts0t062());
		list.put(63, images.ts0t063());
		list.put(64, images.ts0t064());
		list.put(65, images.ts0t065());

		list = imageList.get(1);
		list.put(0, images.ts1t000());
		list.put(1, images.ts1t001());
		list.put(2, images.ts1t002());
		list.put(3, images.ts1t003());
		list.put(4, images.ts1t004());
		list.put(5, images.ts1t005());
		list.put(6, images.ts1t006());
		list.put(7, images.ts1t007());
		list.put(8, images.ts1t008());
		list.put(9, images.ts1t009());
		list.put(10, images.ts1t010());
		list.put(11, images.ts1t011());
		list.put(12, images.ts1t012());
		list.put(13, images.ts1t013());
		list.put(14, images.ts1t014());
		list.put(15, images.ts1t015());
		list.put(16, images.ts1t016());
		list.put(17, images.ts1t017());
		list.put(18, images.ts1t018());
		list.put(19, images.ts1t019());
		list.put(20, images.ts1t020());
		list.put(21, images.ts1t021());
		list.put(22, images.ts1t022());
		list.put(23, images.ts1t023());
		list.put(24, images.ts1t024());
		list.put(25, images.ts1t025());
		list.put(26, images.ts1t026());
		list.put(27, images.ts1t027());
		list.put(28, images.ts1t028());
		list.put(29, images.ts1t029());
		list.put(30, images.ts1t030());
		list.put(31, images.ts1t031());
		list.put(32, images.ts1t032());
		list.put(33, images.ts1t033());
		list.put(34, images.ts1t034());
		list.put(35, images.ts1t035());
		list.put(36, images.ts1t036());
		list.put(37, images.ts1t037());
		list.put(38, images.ts1t038());
		list.put(39, images.ts1t039());
		list.put(40, images.ts1t040());
		list.put(41, images.ts1t041());
		list.put(42, images.ts1t042());
		list.put(43, images.ts1t043());
		list.put(44, images.ts1t044());
		list.put(45, images.ts1t045());
		list.put(46, images.ts1t046());
		list.put(47, images.ts1t047());
		list.put(48, images.ts1t048());
		list.put(49, images.ts1t049());
		list.put(50, images.ts1t050());
		list.put(51, images.ts1t051());
		list.put(52, images.ts1t052());
		list.put(53, images.ts1t053());
		list.put(54, images.ts1t054());
		list.put(55, images.ts1t055());
		list.put(56, images.ts1t056());
		list.put(57, images.ts1t057());
		list.put(58, images.ts1t058());
		list.put(59, images.ts1t059());
		list.put(60, images.ts1t060());
		list.put(61, images.ts1t061());
		list.put(62, images.ts1t062());
		list.put(63, images.ts1t063());
		list.put(64, images.ts1t064());
		list.put(65, images.ts1t065());
		list.put(66, images.ts1t066());
		list.put(67, images.ts1t067());
		list.put(68, images.ts1t068());
		list.put(69, images.ts1t069());
		list.put(70, images.ts1t070());
		list.put(71, images.ts1t071());
		list.put(72, images.ts1t072());
		list.put(73, images.ts1t073());
		list.put(74, images.ts1t074());
		list.put(75, images.ts1t075());
		list.put(76, images.ts1t076());
		list.put(77, images.ts1t077());
		list.put(78, images.ts1t078());
		list.put(79, images.ts1t079());
		list.put(80, images.ts1t080());
		list.put(81, images.ts1t081());
		list.put(82, images.ts1t082());
		list.put(83, images.ts1t083());
		list.put(84, images.ts1t084());
		list.put(85, images.ts1t085());
		list.put(86, images.ts1t086());
		list.put(87, images.ts1t087());
		list.put(88, images.ts1t088());
		list.put(89, images.ts1t089());
		list.put(90, images.ts1t090());
		list.put(91, images.ts1t091());
		list.put(92, images.ts1t092());
		list.put(93, images.ts1t093());
		list.put(94, images.ts1t094());
		list.put(95, images.ts1t095());
		list.put(96, images.ts1t096());
		list.put(97, images.ts1t097());
		list.put(98, images.ts1t098());
		list.put(99, images.ts1t099());
		list.put(100, images.ts1t100());
		list.put(101, images.ts1t101());
		list.put(102, images.ts1t102());
		list.put(103, images.ts1t103());
		list.put(104, images.ts1t104());
		list.put(105, images.ts1t105());
		list.put(106, images.ts1t106());
		list.put(107, images.ts1t107());
		list.put(108, images.ts1t108());
		list.put(109, images.ts1t109());
		list.put(110, images.ts1t110());
		list.put(111, images.ts1t111());
		list.put(112, images.ts1t112());
		list.put(113, images.ts1t113());
		list.put(114, images.ts1t114());
		list.put(115, images.ts1t115());
		list.put(116, images.ts1t116());
		list.put(117, images.ts1t117());
		list.put(118, images.ts1t118());
		list.put(119, images.ts1t119());
		list.put(120, images.ts1t120());
		list.put(121, images.ts1t121());
		list.put(122, images.ts1t122());
		list.put(123, images.ts1t123());
		list.put(124, images.ts1t124());
		list.put(125, images.ts1t125());
		list.put(126, images.ts1t126());
		list.put(127, images.ts1t127());
		list.put(128, images.ts1t128());
		list.put(129, images.ts1t129());
		list.put(130, images.ts1t130());
		list.put(131, images.ts1t131());
		list.put(132, images.ts1t132());
		list.put(133, images.ts1t133());
		list.put(134, images.ts1t134());
		list.put(135, images.ts1t135());
		list.put(136, images.ts1t136());
		list.put(137, images.ts1t137());
		list.put(138, images.ts1t138());
		list.put(139, images.ts1t139());
		list.put(140, images.ts1t140());

		list = imageList.get(2);
		list.put(0, images.ts2t000());
		list.put(1, images.ts2t001());
		list.put(2, images.ts2t002());
		list.put(3, images.ts2t003());
		list.put(4, images.ts2t004());
		list.put(5, images.ts2t005());
		list.put(6, images.ts2t006());
		list.put(7, images.ts2t007());
		list.put(8, images.ts2t008());
		list.put(9, images.ts2t009());
		list.put(10, images.ts2t010());
		list.put(11, images.ts2t011());
		list.put(12, images.ts2t012());
		list.put(13, images.ts2t013());
		list.put(14, images.ts2t014());
		list.put(15, images.ts2t015());
		list.put(16, images.ts2t016());
		list.put(17, images.ts2t017());
		list.put(18, images.ts2t018());
		list.put(19, images.ts2t019());
		list.put(20, images.ts2t020());
		list.put(21, images.ts2t021());
		list.put(22, images.ts2t022());
		list.put(23, images.ts2t023());
		list.put(24, images.ts2t024());
		list.put(25, images.ts2t025());
		list.put(26, images.ts2t026());
		list.put(27, images.ts2t027());
		list.put(28, images.ts2t028());
		list.put(29, images.ts2t029());
		list.put(30, images.ts2t030());
		list.put(31, images.ts2t031());
		list.put(32, images.ts2t032());
		list.put(33, images.ts2t033());
		list.put(34, images.ts2t034());
		list.put(35, images.ts2t035());
		list.put(36, images.ts2t036());
		list.put(37, images.ts2t037());
		list.put(38, images.ts2t038());
		list.put(39, images.ts2t039());
		list.put(40, images.ts2t040());
		list.put(41, images.ts2t041());
		list.put(42, images.ts2t042());
		list.put(43, images.ts2t043());
		list.put(44, images.ts2t044());
		list.put(45, images.ts2t045());
		list.put(46, images.ts2t046());
		list.put(47, images.ts2t047());
		list.put(48, images.ts2t048());
		list.put(49, images.ts2t049());
		list.put(50, images.ts2t050());
		list.put(51, images.ts2t051());
		list.put(52, images.ts2t052());
		list.put(53, images.ts2t053());
		list.put(54, images.ts2t054());
		list.put(55, images.ts2t055());
		list.put(56, images.ts2t056());
		list.put(57, images.ts2t057());
		list.put(58, images.ts2t058());
		list.put(59, images.ts2t059());
		list.put(60, images.ts2t060());
		list.put(61, images.ts2t061());
		list.put(62, images.ts2t062());
		list.put(63, images.ts2t063());
		list.put(64, images.ts2t064());
		list.put(65, images.ts2t065());
		list.put(66, images.ts2t066());
		list.put(67, images.ts2t067());
		list.put(68, images.ts2t068());
		list.put(69, images.ts2t069());
		list.put(70, images.ts2t070());
		list.put(71, images.ts2t071());
		list.put(72, images.ts2t072());
		list.put(73, images.ts2t073());
		list.put(74, images.ts2t074());
		list.put(75, images.ts2t075());
		list.put(76, images.ts2t076());
		list.put(77, images.ts2t077());
		list.put(78, images.ts2t078());
		list.put(79, images.ts2t079());
		list.put(80, images.ts2t080());
		list.put(81, images.ts2t081());
		list.put(82, images.ts2t082());
		list.put(83, images.ts2t083());
		list.put(84, images.ts2t084());
		list.put(85, images.ts2t085());
		list.put(86, images.ts2t086());
		list.put(87, images.ts2t087());
		list.put(88, images.ts2t088());
		list.put(89, images.ts2t089());
		list.put(90, images.ts2t090());
		list.put(91, images.ts2t091());
		list.put(92, images.ts2t092());
		list.put(93, images.ts2t093());
		list.put(94, images.ts2t094());
		list.put(95, images.ts2t095());
		list.put(96, images.ts2t096());
		list.put(97, images.ts2t097());
		list.put(98, images.ts2t098());
		list.put(99, images.ts2t099());
		list.put(100, images.ts2t100());
		list.put(101, images.ts2t101());
		list.put(102, images.ts2t102());
		list.put(103, images.ts2t103());
		list.put(104, images.ts2t104());
		list.put(105, images.ts2t105());
		list.put(106, images.ts2t106());
		list.put(107, images.ts2t107());
		list.put(108, images.ts2t108());
		list.put(109, images.ts2t109());
		list.put(110, images.ts2t110());
		list.put(111, images.ts2t111());
		list.put(112, images.ts2t112());
		list.put(113, images.ts2t113());
		list.put(114, images.ts2t114());
		list.put(115, images.ts2t115());
		list.put(116, images.ts2t116());
		list.put(117, images.ts2t117());
		list.put(118, images.ts2t118());
		list.put(119, images.ts2t119());
		list.put(120, images.ts2t120());
		list.put(121, images.ts2t121());
		list.put(122, images.ts2t122());
		list.put(123, images.ts2t123());
		list.put(124, images.ts2t124());
		list.put(125, images.ts2t125());
		list.put(126, images.ts2t126());
		list.put(127, images.ts2t127());
		list.put(128, images.ts2t128());
		list.put(129, images.ts2t129());
		list.put(130, images.ts2t130());
		list.put(131, images.ts2t131());
		list.put(132, images.ts2t132());
		list.put(133, images.ts2t133());
		list.put(134, images.ts2t134());
		list.put(135, images.ts2t135());
		list.put(136, images.ts2t136());
		list.put(137, images.ts2t137());
		list.put(138, images.ts2t138());
		list.put(139, images.ts2t139());
		list.put(140, images.ts2t140());
		list.put(141, images.ts2t141());
		list.put(142, images.ts2t142());
		list.put(143, images.ts2t143());
		list.put(144, images.ts2t144());
		list.put(145, images.ts2t145());
		list.put(146, images.ts2t146());
		list.put(147, images.ts2t147());
		list.put(148, images.ts2t148());
		list.put(149, images.ts2t149());
		list.put(150, images.ts2t150());
		list.put(151, images.ts2t151());
		list.put(152, images.ts2t152());
		list.put(153, images.ts2t153());
		list.put(154, images.ts2t154());
		list.put(155, images.ts2t155());
		list.put(156, images.ts2t156());
		list.put(157, images.ts2t157());
		list.put(158, images.ts2t158());
		list.put(159, images.ts2t159());
		list.put(160, images.ts2t160());
		list.put(161, images.ts2t161());
		list.put(162, images.ts2t162());

		list = imageList.get(3);
		list.put(0, images.ts3t000());
		list.put(1, images.ts3t001());
		list.put(2, images.ts3t002());
		list.put(3, images.ts3t003());
		list.put(4, images.ts3t004());
		list.put(5, images.ts3t005());
		list.put(6, images.ts3t006());
		list.put(7, images.ts3t007());
		list.put(8, images.ts3t008());
		list.put(9, images.ts3t009());
		list.put(10, images.ts3t010());
		list.put(11, images.ts3t011());
		list.put(12, images.ts3t012());
		list.put(13, images.ts3t013());
		list.put(14, images.ts3t014());
		list.put(15, images.ts3t015());
		list.put(16, images.ts3t016());
		list.put(17, images.ts3t017());
		list.put(18, images.ts3t018());
		list.put(19, images.ts3t019());
		list.put(20, images.ts3t020());
		list.put(21, images.ts3t021());
		list.put(22, images.ts3t022());
		list.put(23, images.ts3t023());
		list.put(24, images.ts3t024());
		list.put(25, images.ts3t025());
		list.put(26, images.ts3t026());
		list.put(27, images.ts3t027());
		list.put(28, images.ts3t028());
		list.put(29, images.ts3t029());
		list.put(30, images.ts3t030());
		list.put(31, images.ts3t031());
		list.put(32, images.ts3t032());
		list.put(33, images.ts3t033());
		list.put(34, images.ts3t034());
		list.put(35, images.ts3t035());
		list.put(36, images.ts3t036());
		list.put(37, images.ts3t037());
		list.put(38, images.ts3t038());
		list.put(39, images.ts3t039());
		list.put(40, images.ts3t040());
		list.put(41, images.ts3t041());
		list.put(42, images.ts3t042());
		list.put(43, images.ts3t043());
		list.put(44, images.ts3t044());
		list.put(45, images.ts3t045());
		list.put(46, images.ts3t046());
		list.put(47, images.ts3t047());
		list.put(48, images.ts3t048());
		list.put(49, images.ts3t049());
		list.put(50, images.ts3t050());
		list.put(51, images.ts3t051());
		list.put(52, images.ts3t052());
		list.put(53, images.ts3t053());
		list.put(54, images.ts3t054());
		list.put(55, images.ts3t055());
		list.put(56, images.ts3t056());
		list.put(57, images.ts3t057());
		list.put(58, images.ts3t058());
		list.put(59, images.ts3t059());
		list.put(60, images.ts3t060());
		list.put(61, images.ts3t061());
		list.put(62, images.ts3t062());
		list.put(63, images.ts3t063());
		list.put(64, images.ts3t064());
		list.put(65, images.ts3t065());
		list.put(66, images.ts3t066());
		list.put(67, images.ts3t067());
		list.put(68, images.ts3t068());
		list.put(69, images.ts3t069());
		list.put(70, images.ts3t070());
		list.put(71, images.ts3t071());
		list.put(72, images.ts3t072());
		list.put(73, images.ts3t073());
		list.put(74, images.ts3t074());
		list.put(75, images.ts3t075());
		list.put(76, images.ts3t076());
		list.put(77, images.ts3t077());
		list.put(78, images.ts3t078());
		list.put(79, images.ts3t079());
		list.put(80, images.ts3t080());
		list.put(81, images.ts3t081());
		list.put(82, images.ts3t082());
		list.put(83, images.ts3t083());
		list.put(84, images.ts3t084());
		list.put(85, images.ts3t085());
		list.put(86, images.ts3t086());
		list.put(87, images.ts3t087());
		list.put(88, images.ts3t088());
		list.put(89, images.ts3t089());
		list.put(90, images.ts3t090());
		list.put(91, images.ts3t091());
		list.put(92, images.ts3t092());
		list.put(93, images.ts3t093());
		list.put(94, images.ts3t094());
		list.put(95, images.ts3t095());
		list.put(96, images.ts3t096());
		list.put(97, images.ts3t097());
		list.put(98, images.ts3t098());
		list.put(99, images.ts3t099());
		list.put(100, images.ts3t100());
		list.put(101, images.ts3t101());
		list.put(102, images.ts3t102());
		list.put(103, images.ts3t103());
		list.put(104, images.ts3t104());
		list.put(105, images.ts3t105());
		list.put(106, images.ts3t106());

		list = imageList.get(4);
		list.put(0, images.ts4t000());
		list.put(1, images.ts4t001());
		list.put(2, images.ts4t002());
		list.put(3, images.ts4t003());
		list.put(4, images.ts4t004());
		list.put(5, images.ts4t005());
		list.put(6, images.ts4t006());
		list.put(7, images.ts4t007());
		list.put(8, images.ts4t008());
		list.put(9, images.ts4t009());
		list.put(10, images.ts4t010());
		list.put(11, images.ts4t011());
		list.put(12, images.ts4t012());
		list.put(13, images.ts4t013());
		list.put(14, images.ts4t014());
		list.put(15, images.ts4t015());
		list.put(16, images.ts4t016());
		list.put(17, images.ts4t017());
		list.put(18, images.ts4t018());
		list.put(19, images.ts4t019());
		list.put(20, images.ts4t020());
		list.put(21, images.ts4t021());
		list.put(22, images.ts4t022());
		list.put(23, images.ts4t023());
		list.put(24, images.ts4t024());
		list.put(25, images.ts4t025());
		list.put(26, images.ts4t026());
		list.put(27, images.ts4t027());
		list.put(28, images.ts4t028());
		list.put(29, images.ts4t029());
		list.put(30, images.ts4t030());
		list.put(31, images.ts4t031());
		list.put(32, images.ts4t032());
		list.put(33, images.ts4t033());
		list.put(34, images.ts4t034());
		list.put(35, images.ts4t035());
		list.put(36, images.ts4t036());
		list.put(37, images.ts4t037());
		list.put(38, images.ts4t038());
		list.put(39, images.ts4t039());
		list.put(40, images.ts4t040());
		list.put(41, images.ts4t041());
		list.put(42, images.ts4t042());
		list.put(43, images.ts4t043());
		list.put(44, images.ts4t044());
		list.put(45, images.ts4t045());
		list.put(46, images.ts4t046());
		list.put(47, images.ts4t047());
		list.put(48, images.ts4t048());
		list.put(49, images.ts4t049());
		list.put(50, images.ts4t050());
		list.put(51, images.ts4t051());
		list.put(52, images.ts4t052());
		list.put(53, images.ts4t053());
		list.put(54, images.ts4t054());
		list.put(55, images.ts4t055());
		list.put(56, images.ts4t056());
		list.put(57, images.ts4t057());
		list.put(58, images.ts4t058());
		list.put(59, images.ts4t059());
		list.put(60, images.ts4t060());
		list.put(61, images.ts4t061());
		list.put(62, images.ts4t062());
		list.put(63, images.ts4t063());
		list.put(64, images.ts4t064());
		list.put(65, images.ts4t065());
		list.put(66, images.ts4t066());
		list.put(67, images.ts4t067());
		list.put(68, images.ts4t068());
		list.put(69, images.ts4t069());
		list.put(70, images.ts4t070());
		list.put(71, images.ts4t071());
		list.put(72, images.ts4t072());
		list.put(73, images.ts4t073());
		list.put(74, images.ts4t074());
		list.put(75, images.ts4t075());
		list.put(76, images.ts4t076());
		list.put(77, images.ts4t077());
		list.put(78, images.ts4t078());
		list.put(79, images.ts4t079());
		list.put(80, images.ts4t080());
		list.put(81, images.ts4t081());
		list.put(82, images.ts4t082());
		list.put(83, images.ts4t083());
		list.put(84, images.ts4t084());
		list.put(85, images.ts4t085());
		list.put(86, images.ts4t086());
		list.put(87, images.ts4t087());
		list.put(88, images.ts4t088());
		list.put(89, images.ts4t089());
		list.put(90, images.ts4t090());
		list.put(91, images.ts4t091());
		list.put(92, images.ts4t092());
		list.put(93, images.ts4t093());
		list.put(94, images.ts4t094());
		list.put(95, images.ts4t095());
		list.put(96, images.ts4t096());
		list.put(97, images.ts4t097());
		list.put(98, images.ts4t098());
		list.put(99, images.ts4t099());
		list.put(100, images.ts4t100());
		list.put(101, images.ts4t101());
		list.put(102, images.ts4t102());
		list.put(103, images.ts4t103());
		list.put(104, images.ts4t104());
		list.put(105, images.ts4t105());
		list.put(106, images.ts4t106());
		list.put(107, images.ts4t107());
		list.put(108, images.ts4t108());
		list.put(109, images.ts4t109());
		list.put(110, images.ts4t110());
		list.put(111, images.ts4t111());
		list.put(112, images.ts4t112());
		list.put(113, images.ts4t113());
		list.put(114, images.ts4t114());
		list.put(115, images.ts4t115());
		list.put(116, images.ts4t116());
		list.put(117, images.ts4t117());
		list.put(118, images.ts4t118());
		list.put(119, images.ts4t119());
		list.put(120, images.ts4t120());
		list.put(121, images.ts4t121());
		list.put(122, images.ts4t122());
		list.put(123, images.ts4t123());
		list.put(124, images.ts4t124());
		list.put(125, images.ts4t125());
		list.put(126, images.ts4t126());

		list = imageList.get(5);
		list.put(0, images.ts5t000());
		list.put(1, images.ts5t001());
		list.put(2, images.ts5t002());
		list.put(3, images.ts5t003());
		list.put(4, images.ts5t004());
		list.put(5, images.ts5t005());
		list.put(6, images.ts5t006());
		list.put(7, images.ts5t007());
		list.put(8, images.ts5t008());
		list.put(9, images.ts5t009());
		list.put(10, images.ts5t010());
		list.put(11, images.ts5t011());
		list.put(12, images.ts5t012());
		list.put(13, images.ts5t013());
		list.put(14, images.ts5t014());
		list.put(15, images.ts5t015());
		list.put(16, images.ts5t016());
		list.put(17, images.ts5t017());
		list.put(18, images.ts5t018());
		list.put(19, images.ts5t019());
		list.put(20, images.ts5t020());
		list.put(21, images.ts5t021());
		list.put(22, images.ts5t022());
		list.put(23, images.ts5t023());
		list.put(24, images.ts5t024());
		list.put(25, images.ts5t025());
		list.put(26, images.ts5t026());
		list.put(27, images.ts5t027());
		list.put(28, images.ts5t028());
		list.put(29, images.ts5t029());
		list.put(30, images.ts5t030());
		list.put(31, images.ts5t031());
		list.put(32, images.ts5t032());
		list.put(33, images.ts5t033());
		list.put(34, images.ts5t034());
		list.put(35, images.ts5t035());
		list.put(36, images.ts5t036());
		list.put(37, images.ts5t037());
		list.put(38, images.ts5t038());
		list.put(39, images.ts5t039());
		list.put(40, images.ts5t040());
		list.put(41, images.ts5t041());
		list.put(42, images.ts5t042());
		list.put(43, images.ts5t043());
		list.put(44, images.ts5t044());
		list.put(45, images.ts5t045());
		list.put(46, images.ts5t046());
		list.put(47, images.ts5t047());
		list.put(48, images.ts5t048());
		list.put(49, images.ts5t049());
		list.put(50, images.ts5t050());
		list.put(51, images.ts5t051());
		list.put(52, images.ts5t052());
		list.put(53, images.ts5t053());
		list.put(54, images.ts5t054());
		list.put(55, images.ts5t055());
		list.put(56, images.ts5t056());
		list.put(57, images.ts5t057());
		list.put(58, images.ts5t058());
		list.put(59, images.ts5t059());
		list.put(60, images.ts5t060());
		list.put(61, images.ts5t061());
		list.put(62, images.ts5t062());
		list.put(63, images.ts5t063());
		list.put(64, images.ts5t064());
		list.put(65, images.ts5t065());
		list.put(66, images.ts5t066());
		list.put(67, images.ts5t067());
		list.put(68, images.ts5t068());
		list.put(69, images.ts5t069());
		list.put(70, images.ts5t070());
		list.put(71, images.ts5t071());
		list.put(72, images.ts5t072());
		list.put(73, images.ts5t073());
		list.put(74, images.ts5t074());
		list.put(75, images.ts5t075());
		list.put(76, images.ts5t076());
		list.put(77, images.ts5t077());
		list.put(78, images.ts5t078());
		list.put(79, images.ts5t079());
		list.put(80, images.ts5t080());
		list.put(81, images.ts5t081());
		list.put(82, images.ts5t082());
		list.put(83, images.ts5t083());
		list.put(84, images.ts5t084());
		list.put(85, images.ts5t085());
		list.put(86, images.ts5t086());
		list.put(87, images.ts5t087());
		list.put(88, images.ts5t088());
		list.put(89, images.ts5t089());
		list.put(90, images.ts5t090());
		list.put(91, images.ts5t091());
		list.put(92, images.ts5t092());
		list.put(93, images.ts5t093());
		list.put(94, images.ts5t094());
		list.put(95, images.ts5t095());
		list.put(96, images.ts5t096());
		list.put(97, images.ts5t097());
		list.put(98, images.ts5t098());
		list.put(99, images.ts5t099());
		list.put(100, images.ts5t100());
		list.put(101, images.ts5t101());
		list.put(102, images.ts5t102());
		list.put(103, images.ts5t103());
		list.put(104, images.ts5t104());
		list.put(105, images.ts5t105());
		list.put(106, images.ts5t106());
		list.put(107, images.ts5t107());
		list.put(108, images.ts5t108());
		list.put(109, images.ts5t109());
		list.put(110, images.ts5t110());
		list.put(111, images.ts5t111());
		list.put(112, images.ts5t112());
		list.put(113, images.ts5t113());
		list.put(114, images.ts5t114());
		list.put(115, images.ts5t115());
		list.put(116, images.ts5t116());
		list.put(117, images.ts5t117());

		list = imageList.get(6);
		list.put(0, images.ts6t000());
		list.put(1, images.ts6t001());
		list.put(2, images.ts6t002());
		list.put(3, images.ts6t003());
		list.put(4, images.ts6t004());
		list.put(5, images.ts6t005());
		list.put(6, images.ts6t006());
		list.put(7, images.ts6t007());
		list.put(8, images.ts6t008());
		list.put(9, images.ts6t009());
		list.put(10, images.ts6t010());
		list.put(11, images.ts6t011());
		list.put(12, images.ts6t012());
		list.put(13, images.ts6t013());
		list.put(14, images.ts6t014());
		list.put(15, images.ts6t015());
		list.put(16, images.ts6t016());
		list.put(17, images.ts6t017());
		list.put(18, images.ts6t018());
		list.put(19, images.ts6t019());
		list.put(20, images.ts6t020());
		list.put(21, images.ts6t021());
		list.put(22, images.ts6t022());
		list.put(23, images.ts6t023());
		list.put(24, images.ts6t024());
		list.put(25, images.ts6t025());
		list.put(26, images.ts6t026());
		list.put(27, images.ts6t027());
		list.put(28, images.ts6t028());
		list.put(29, images.ts6t029());
		list.put(30, images.ts6t030());
		list.put(31, images.ts6t031());
		list.put(32, images.ts6t032());
		list.put(33, images.ts6t033());
		list.put(34, images.ts6t034());
		list.put(35, images.ts6t035());
		list.put(36, images.ts6t036());
		list.put(37, images.ts6t037());
		list.put(38, images.ts6t038());
		list.put(39, images.ts6t039());
		list.put(40, images.ts6t040());
		list.put(41, images.ts6t041());
		list.put(42, images.ts6t042());
		list.put(43, images.ts6t043());
		list.put(44, images.ts6t044());
		list.put(45, images.ts6t045());
		list.put(46, images.ts6t046());
		list.put(47, images.ts6t047());
		list.put(48, images.ts6t048());
		list.put(49, images.ts6t049());
		list.put(50, images.ts6t050());
		list.put(51, images.ts6t051());
		list.put(52, images.ts6t052());
		list.put(53, images.ts6t053());
		list.put(54, images.ts6t054());
		list.put(55, images.ts6t055());
		list.put(56, images.ts6t056());
		list.put(57, images.ts6t057());
		list.put(58, images.ts6t058());
		list.put(59, images.ts6t059());
		list.put(60, images.ts6t060());
		list.put(61, images.ts6t061());
		list.put(62, images.ts6t062());
		list.put(63, images.ts6t063());
		list.put(64, images.ts6t064());
		list.put(65, images.ts6t065());
		list.put(66, images.ts6t066());
		list.put(67, images.ts6t067());
		list.put(68, images.ts6t068());
		list.put(69, images.ts6t069());
		list.put(70, images.ts6t070());
		list.put(71, images.ts6t071());
		list.put(72, images.ts6t072());
		list.put(73, images.ts6t073());
		list.put(74, images.ts6t074());
		list.put(75, images.ts6t075());
		list.put(76, images.ts6t076());
		list.put(77, images.ts6t077());
		list.put(78, images.ts6t078());
		list.put(79, images.ts6t079());
		list.put(80, images.ts6t080());
		list.put(81, images.ts6t081());
		list.put(82, images.ts6t082());
		list.put(83, images.ts6t083());
		list.put(84, images.ts6t084());
		list.put(85, images.ts6t085());
		list.put(86, images.ts6t086());
		list.put(87, images.ts6t087());
		list.put(88, images.ts6t088());
		list.put(89, images.ts6t089());

		list = imageList.get(7);
		list.put(0, images.ts7t000());
		list.put(1, images.ts7t001());
		list.put(2, images.ts7t002());
		list.put(3, images.ts7t003());
		list.put(4, images.ts7t004());
		list.put(5, images.ts7t005());
		list.put(6, images.ts7t006());
		list.put(7, images.ts7t007());
		list.put(8, images.ts7t008());
		list.put(9, images.ts7t009());
		list.put(10, images.ts7t010());
		list.put(11, images.ts7t011());
		list.put(12, images.ts7t012());
		list.put(13, images.ts7t013());
		list.put(14, images.ts7t014());
		list.put(15, images.ts7t015());
		list.put(16, images.ts7t016());
		list.put(17, images.ts7t017());
		list.put(18, images.ts7t018());
		list.put(19, images.ts7t019());
		list.put(20, images.ts7t020());
		list.put(21, images.ts7t021());
		list.put(22, images.ts7t022());
		list.put(23, images.ts7t023());
		list.put(24, images.ts7t024());
		list.put(25, images.ts7t025());
		list.put(26, images.ts7t026());
		list.put(27, images.ts7t027());
		list.put(28, images.ts7t028());
		list.put(29, images.ts7t029());
		list.put(30, images.ts7t030());
		list.put(31, images.ts7t031());
		list.put(32, images.ts7t032());
		list.put(33, images.ts7t033());
		list.put(34, images.ts7t034());
		list.put(35, images.ts7t035());
		list.put(36, images.ts7t036());
		list.put(37, images.ts7t037());
		list.put(38, images.ts7t038());
		list.put(39, images.ts7t039());
		list.put(40, images.ts7t040());
		list.put(41, images.ts7t041());
		list.put(42, images.ts7t042());
		list.put(43, images.ts7t043());
		list.put(44, images.ts7t044());
		list.put(45, images.ts7t045());
		list.put(46, images.ts7t046());
		list.put(47, images.ts7t047());
		list.put(48, images.ts7t048());
		list.put(49, images.ts7t049());
		list.put(50, images.ts7t050());
		list.put(51, images.ts7t051());
		list.put(52, images.ts7t052());
		list.put(53, images.ts7t053());
		list.put(54, images.ts7t054());
		list.put(55, images.ts7t055());
		list.put(56, images.ts7t056());
		list.put(57, images.ts7t057());
		list.put(58, images.ts7t058());
		list.put(59, images.ts7t059());
		list.put(60, images.ts7t060());
		list.put(61, images.ts7t061());
		list.put(62, images.ts7t062());
		list.put(63, images.ts7t063());
		list.put(64, images.ts7t064());
		list.put(65, images.ts7t065());
		list.put(66, images.ts7t066());
		list.put(67, images.ts7t067());
		list.put(68, images.ts7t068());
		list.put(69, images.ts7t069());
		list.put(70, images.ts7t070());
		list.put(71, images.ts7t071());
		list.put(72, images.ts7t072());
		list.put(73, images.ts7t073());
		list.put(74, images.ts7t074());
		list.put(75, images.ts7t075());
		list.put(76, images.ts7t076());
		list.put(77, images.ts7t077());
		list.put(78, images.ts7t078());
		list.put(79, images.ts7t079());
		list.put(80, images.ts7t080());
		list.put(81, images.ts7t081());
		list.put(82, images.ts7t082());
		list.put(83, images.ts7t083());
		list.put(84, images.ts7t084());
		list.put(85, images.ts7t085());
		list.put(86, images.ts7t086());
		list.put(87, images.ts7t087());
		list.put(88, images.ts7t088());
		list.put(89, images.ts7t089());
		list.put(90, images.ts7t090());
		list.put(91, images.ts7t091());
		list.put(92, images.ts7t092());
		list.put(93, images.ts7t093());
		list.put(94, images.ts7t094());
		list.put(95, images.ts7t095());
		list.put(96, images.ts7t096());
		list.put(97, images.ts7t097());
		list.put(98, images.ts7t098());
		list.put(99, images.ts7t099());
		list.put(100, images.ts7t100());
		list.put(101, images.ts7t101());
		list.put(102, images.ts7t102());
		list.put(103, images.ts7t103());

		list = imageList.get(8);
		list.put(0, images.ts8t000());
		list.put(1, images.ts8t001());
		list.put(2, images.ts8t002());
		list.put(3, images.ts8t003());
		list.put(4, images.ts8t004());
		list.put(5, images.ts8t005());
		list.put(6, images.ts8t006());
		list.put(7, images.ts8t007());
		list.put(8, images.ts8t008());
		list.put(9, images.ts8t009());
		list.put(10, images.ts8t010());
		list.put(11, images.ts8t011());
		list.put(12, images.ts8t012());
		list.put(13, images.ts8t013());
		list.put(14, images.ts8t014());
		list.put(15, images.ts8t015());
		list.put(16, images.ts8t016());
		list.put(17, images.ts8t017());
		list.put(18, images.ts8t018());
		list.put(19, images.ts8t019());
		list.put(20, images.ts8t020());
		list.put(21, images.ts8t021());
		list.put(22, images.ts8t022());
		list.put(23, images.ts8t023());
		list.put(24, images.ts8t024());
		list.put(25, images.ts8t025());
		list.put(26, images.ts8t026());
		list.put(27, images.ts8t027());
		list.put(28, images.ts8t028());
		list.put(29, images.ts8t029());
		list.put(30, images.ts8t030());
		list.put(31, images.ts8t031());
		list.put(32, images.ts8t032());
		list.put(33, images.ts8t033());
		list.put(34, images.ts8t034());
		list.put(35, images.ts8t035());
		list.put(36, images.ts8t036());
		list.put(37, images.ts8t037());
		list.put(38, images.ts8t038());
		list.put(39, images.ts8t039());
		list.put(40, images.ts8t040());
		list.put(41, images.ts8t041());
		list.put(42, images.ts8t042());
		list.put(43, images.ts8t043());
		list.put(44, images.ts8t044());
		list.put(45, images.ts8t045());
		list.put(46, images.ts8t046());
		list.put(47, images.ts8t047());
		list.put(48, images.ts8t048());
		list.put(49, images.ts8t049());
		list.put(50, images.ts8t050());
		list.put(51, images.ts8t051());
		list.put(52, images.ts8t052());
		list.put(53, images.ts8t053());
		list.put(54, images.ts8t054());
		list.put(55, images.ts8t055());
		list.put(56, images.ts8t056());
		list.put(57, images.ts8t057());
		list.put(58, images.ts8t058());
		list.put(59, images.ts8t059());
		list.put(60, images.ts8t060());
		list.put(61, images.ts8t061());
		list.put(62, images.ts8t062());
		list.put(63, images.ts8t063());
		list.put(64, images.ts8t064());
		list.put(65, images.ts8t065());
		list.put(66, images.ts8t066());
		list.put(67, images.ts8t067());
		list.put(68, images.ts8t068());
		list.put(69, images.ts8t069());
		list.put(70, images.ts8t070());
		list.put(71, images.ts8t071());
		list.put(72, images.ts8t072());
		list.put(73, images.ts8t073());
		list.put(74, images.ts8t074());
		list.put(75, images.ts8t075());
		list.put(76, images.ts8t076());
		list.put(77, images.ts8t077());
		list.put(78, images.ts8t078());
		list.put(79, images.ts8t079());
		list.put(80, images.ts8t080());
		list.put(81, images.ts8t081());
		list.put(82, images.ts8t082());
		list.put(83, images.ts8t083());
		list.put(84, images.ts8t084());
		list.put(85, images.ts8t085());
		list.put(86, images.ts8t086());
		list.put(87, images.ts8t087());
		list.put(88, images.ts8t088());
		list.put(89, images.ts8t089());
		list.put(90, images.ts8t090());
		list.put(91, images.ts8t091());
		list.put(92, images.ts8t092());
		list.put(93, images.ts8t093());
		list.put(94, images.ts8t094());
		list.put(95, images.ts8t095());
		list.put(96, images.ts8t096());
		list.put(97, images.ts8t097());
		list.put(98, images.ts8t098());
		list.put(99, images.ts8t099());
		list.put(100, images.ts8t100());
		list.put(101, images.ts8t101());
		list.put(102, images.ts8t102());
		list.put(103, images.ts8t103());
		list.put(104, images.ts8t104());
		list.put(105, images.ts8t105());
		list.put(106, images.ts8t106());
		list.put(107, images.ts8t107());
		list.put(108, images.ts8t108());
		list.put(109, images.ts8t109());
		list.put(110, images.ts8t110());
		list.put(111, images.ts8t111());
		list.put(112, images.ts8t112());
		list.put(113, images.ts8t113());
		list.put(114, images.ts8t114());
		list.put(115, images.ts8t115());
		list.put(116, images.ts8t116());
		list.put(117, images.ts8t117());
		list.put(118, images.ts8t118());
		list.put(119, images.ts8t119());
		list.put(120, images.ts8t120());
		list.put(121, images.ts8t121());
		list.put(122, images.ts8t122());
		list.put(123, images.ts8t123());
		list.put(124, images.ts8t124());
		list.put(125, images.ts8t125());
		list.put(126, images.ts8t126());
		list.put(127, images.ts8t127());
		list.put(128, images.ts8t128());
		list.put(129, images.ts8t129());
		list.put(130, images.ts8t130());
		list.put(131, images.ts8t131());
		list.put(132, images.ts8t132());
		list.put(133, images.ts8t133());
		list.put(134, images.ts8t134());
	}
	*/
}
