/**
 * 
 */
package securemessages.encryption.main;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * The purpose of this class is to override the aski table and replace it with
 * one that will be easier to handle.<br>
 * It also handles all of the multi used functions and objects
 * 
 * @author Joshua
 * 
 */
public class Constants {

	/**
	 * This is a hashmap of characters to integers.<br>
	 * This comment is to help remind future developers that it should be
	 * characters! not strings!
	 */
	public static HashMap<Character, Integer> textMap = new HashMap<Character, Integer>();
	static {
		textMap.put('a', 0);
		textMap.put('b', 1);
		textMap.put('c', 2);
		textMap.put('d', 3);
		textMap.put('e', 4);
		textMap.put('f', 5);
		textMap.put('g', 6);
		textMap.put('h', 7);
		textMap.put('i', 8);
		textMap.put('j', 9);
		textMap.put('k', 10);
		textMap.put('l', 11);
		textMap.put('m', 12);
		textMap.put('n', 13);
		textMap.put('o', 14);
		textMap.put('p', 15);
		textMap.put('q', 16);
		textMap.put('r', 17);
		textMap.put('s', 18);
		textMap.put('t', 19);
		textMap.put('u', 20);
		textMap.put('v', 21);
		textMap.put('w', 22);
		textMap.put('x', 23);
		textMap.put('y', 24);
		textMap.put('z', 25);
		textMap.put('A', 26);
		textMap.put('B', 27);
		textMap.put('C', 28);
		textMap.put('D', 29);
		textMap.put('E', 30);
		textMap.put('F', 31);
		textMap.put('G', 32);
		textMap.put('H', 33);
		textMap.put('I', 34);
		textMap.put('J', 35);
		textMap.put('K', 36);
		textMap.put('L', 37);
		textMap.put('M', 38);
		textMap.put('N', 39);
		textMap.put('O', 40);
		textMap.put('P', 41);
		textMap.put('Q', 42);
		textMap.put('R', 43);
		textMap.put('S', 44);
		textMap.put('T', 45);
		textMap.put('U', 46);
		textMap.put('V', 47);
		textMap.put('W', 48);
		textMap.put('X', 49);
		textMap.put('Y', 50);
		textMap.put('Z', 51);
		textMap.put(' ', 52);
		textMap.put('!', 53);
		textMap.put('@', 54);
		textMap.put('#', 55);
		textMap.put('$', 56);
		textMap.put('%', 57);
		textMap.put('^', 58);
		textMap.put('&', 59);
		textMap.put('*', 60);
		textMap.put('(', 61);
		textMap.put(')', 62);
		textMap.put('-', 63);
		textMap.put('_', 64);
		textMap.put('=', 65);
		textMap.put('+', 66);
		textMap.put('`', 67);
		textMap.put('~', 68);
		textMap.put('[', 69);
		textMap.put('{', 70);
		textMap.put(']', 71);
		textMap.put('}', 72);
		textMap.put('\\', 73);
		textMap.put(';', 74);
		textMap.put(':', 75);
		textMap.put('"', 76);
		textMap.put('\'', 77);
		textMap.put(',', 78);
		textMap.put('<', 79);
		textMap.put('.', 80);
		textMap.put('>', 81);
		textMap.put('/', 82);
		textMap.put('?', 83);
		textMap.put('0', 84);
		textMap.put('1', 85);
		textMap.put('2', 86);
		textMap.put('3', 87);
		textMap.put('4', 88);
		textMap.put('5', 89);
		textMap.put('6', 90);
		textMap.put('7', 91);
		textMap.put('8', 92);
		textMap.put('9', 93);
	}

	/**
	 * IntegerMap is the reverse of textMap. It takes the corresponding integer
	 * and gives its character value.
	 */
	public static HashMap<Integer, Character> integerMap = new HashMap<Integer, Character>();
	static {
		for (int index = 0; index < textMap.size(); index++) {
			integerMap.put(index, getKeyFromValue(textMap, index));
		}
	}

	public static ArrayList<Integer> primeListForBlockLengthTwo = new ArrayList<Integer>();
	static {
		primeListForBlockLengthTwo.add(101);
		primeListForBlockLengthTwo.add(103);
		primeListForBlockLengthTwo.add(107);
		primeListForBlockLengthTwo.add(109);
		primeListForBlockLengthTwo.add(113);
		primeListForBlockLengthTwo.add(127);
		primeListForBlockLengthTwo.add(131);
		primeListForBlockLengthTwo.add(137);
		primeListForBlockLengthTwo.add(139);
		primeListForBlockLengthTwo.add(149);
		primeListForBlockLengthTwo.add(151);
		primeListForBlockLengthTwo.add(157);
		primeListForBlockLengthTwo.add(163);
		primeListForBlockLengthTwo.add(167);
		primeListForBlockLengthTwo.add(173);
		primeListForBlockLengthTwo.add(179);
		primeListForBlockLengthTwo.add(181);
		primeListForBlockLengthTwo.add(191);
		primeListForBlockLengthTwo.add(193);
		primeListForBlockLengthTwo.add(197);
		primeListForBlockLengthTwo.add(199);
		primeListForBlockLengthTwo.add(211);
		primeListForBlockLengthTwo.add(223);
		primeListForBlockLengthTwo.add(227);
		primeListForBlockLengthTwo.add(229);
		primeListForBlockLengthTwo.add(233);
		primeListForBlockLengthTwo.add(239);
		primeListForBlockLengthTwo.add(241);
		primeListForBlockLengthTwo.add(251);
		primeListForBlockLengthTwo.add(257);
		primeListForBlockLengthTwo.add(263);
		primeListForBlockLengthTwo.add(269);
		primeListForBlockLengthTwo.add(271);
		primeListForBlockLengthTwo.add(277);
		primeListForBlockLengthTwo.add(281);
		primeListForBlockLengthTwo.add(283);
		primeListForBlockLengthTwo.add(293);
		primeListForBlockLengthTwo.add(307);
		primeListForBlockLengthTwo.add(311);
		primeListForBlockLengthTwo.add(313);
		primeListForBlockLengthTwo.add(317);
		primeListForBlockLengthTwo.add(331);
		primeListForBlockLengthTwo.add(337);
		primeListForBlockLengthTwo.add(347);
		primeListForBlockLengthTwo.add(349);
		primeListForBlockLengthTwo.add(353);
		primeListForBlockLengthTwo.add(359);
		primeListForBlockLengthTwo.add(367);
		primeListForBlockLengthTwo.add(373);
		primeListForBlockLengthTwo.add(379);
		primeListForBlockLengthTwo.add(383);
		primeListForBlockLengthTwo.add(389);
		primeListForBlockLengthTwo.add(397);
		primeListForBlockLengthTwo.add(401);
		primeListForBlockLengthTwo.add(409);
		primeListForBlockLengthTwo.add(419);
		primeListForBlockLengthTwo.add(421);
		primeListForBlockLengthTwo.add(431);
		primeListForBlockLengthTwo.add(433);
		primeListForBlockLengthTwo.add(439);
		primeListForBlockLengthTwo.add(443);
		primeListForBlockLengthTwo.add(449);
		primeListForBlockLengthTwo.add(457);
		primeListForBlockLengthTwo.add(461);
		primeListForBlockLengthTwo.add(463);
		primeListForBlockLengthTwo.add(467);
		primeListForBlockLengthTwo.add(479);
		primeListForBlockLengthTwo.add(487);
		primeListForBlockLengthTwo.add(491);
		primeListForBlockLengthTwo.add(499);
		primeListForBlockLengthTwo.add(503);
		primeListForBlockLengthTwo.add(509);
		primeListForBlockLengthTwo.add(521);
		primeListForBlockLengthTwo.add(523);
		primeListForBlockLengthTwo.add(541);
		primeListForBlockLengthTwo.add(547);
		primeListForBlockLengthTwo.add(557);
		primeListForBlockLengthTwo.add(563);
		primeListForBlockLengthTwo.add(569);
		primeListForBlockLengthTwo.add(571);
		primeListForBlockLengthTwo.add(577);
		primeListForBlockLengthTwo.add(587);
		primeListForBlockLengthTwo.add(593);
		primeListForBlockLengthTwo.add(599);
		primeListForBlockLengthTwo.add(601);
		primeListForBlockLengthTwo.add(607);
		primeListForBlockLengthTwo.add(613);
		primeListForBlockLengthTwo.add(617);
		primeListForBlockLengthTwo.add(619);
		primeListForBlockLengthTwo.add(631);
		primeListForBlockLengthTwo.add(641);
		primeListForBlockLengthTwo.add(643);
		primeListForBlockLengthTwo.add(647);
		primeListForBlockLengthTwo.add(653);
		primeListForBlockLengthTwo.add(659);
		primeListForBlockLengthTwo.add(661);
		primeListForBlockLengthTwo.add(673);
		primeListForBlockLengthTwo.add(677);
		primeListForBlockLengthTwo.add(683);
		primeListForBlockLengthTwo.add(691);
		primeListForBlockLengthTwo.add(701);
		primeListForBlockLengthTwo.add(709);
		primeListForBlockLengthTwo.add(719);
		primeListForBlockLengthTwo.add(727);
		primeListForBlockLengthTwo.add(733);
		primeListForBlockLengthTwo.add(739);
		primeListForBlockLengthTwo.add(743);
		primeListForBlockLengthTwo.add(751);
		primeListForBlockLengthTwo.add(757);
		primeListForBlockLengthTwo.add(761);
		primeListForBlockLengthTwo.add(769);
		primeListForBlockLengthTwo.add(773);
		primeListForBlockLengthTwo.add(787);
		primeListForBlockLengthTwo.add(797);
		primeListForBlockLengthTwo.add(809);
		primeListForBlockLengthTwo.add(811);
		primeListForBlockLengthTwo.add(821);
		primeListForBlockLengthTwo.add(823);
		primeListForBlockLengthTwo.add(827);
		primeListForBlockLengthTwo.add(829);
		primeListForBlockLengthTwo.add(839);
		primeListForBlockLengthTwo.add(853);
		primeListForBlockLengthTwo.add(857);
		primeListForBlockLengthTwo.add(859);
		primeListForBlockLengthTwo.add(863);
		primeListForBlockLengthTwo.add(877);
		primeListForBlockLengthTwo.add(881);
		primeListForBlockLengthTwo.add(883);
		primeListForBlockLengthTwo.add(887);
		primeListForBlockLengthTwo.add(907);
		primeListForBlockLengthTwo.add(911);
	}

	public static ArrayList<Integer> primeListForBlockLengthThree = new ArrayList<Integer>();
	static {
		primeListForBlockLengthThree.add(919);
		primeListForBlockLengthThree.add(929);
		primeListForBlockLengthThree.add(937);
		primeListForBlockLengthThree.add(941);
		primeListForBlockLengthThree.add(947);
		primeListForBlockLengthThree.add(953);
		primeListForBlockLengthThree.add(967);
		primeListForBlockLengthThree.add(971);
		primeListForBlockLengthThree.add(977);
		primeListForBlockLengthThree.add(983);
		primeListForBlockLengthThree.add(991);
		primeListForBlockLengthThree.add(997);
		primeListForBlockLengthThree.add(1009);
		primeListForBlockLengthThree.add(1013);
		primeListForBlockLengthThree.add(1019);
		primeListForBlockLengthThree.add(1021);
		primeListForBlockLengthThree.add(1031);
		primeListForBlockLengthThree.add(1033);
		primeListForBlockLengthThree.add(1039);
		primeListForBlockLengthThree.add(1049);
		primeListForBlockLengthThree.add(1051);
		primeListForBlockLengthThree.add(1061);
		primeListForBlockLengthThree.add(1063);
		primeListForBlockLengthThree.add(1069);
		primeListForBlockLengthThree.add(1087);
		primeListForBlockLengthThree.add(1091);
		primeListForBlockLengthThree.add(1093);
		primeListForBlockLengthThree.add(1097);
		primeListForBlockLengthThree.add(1103);
		primeListForBlockLengthThree.add(1109);
		primeListForBlockLengthThree.add(1117);
		primeListForBlockLengthThree.add(1123);
		primeListForBlockLengthThree.add(1129);
		primeListForBlockLengthThree.add(1151);
		primeListForBlockLengthThree.add(1153);
		primeListForBlockLengthThree.add(1163);
		primeListForBlockLengthThree.add(1171);
		primeListForBlockLengthThree.add(1181);
		primeListForBlockLengthThree.add(1187);
		primeListForBlockLengthThree.add(1193);
		primeListForBlockLengthThree.add(1201);
		primeListForBlockLengthThree.add(1213);
		primeListForBlockLengthThree.add(1217);
		primeListForBlockLengthThree.add(1223);
		primeListForBlockLengthThree.add(1229);
		primeListForBlockLengthThree.add(1231);
		primeListForBlockLengthThree.add(1237);
		primeListForBlockLengthThree.add(1249);
		primeListForBlockLengthThree.add(1259);
		primeListForBlockLengthThree.add(1277);
		primeListForBlockLengthThree.add(1279);
		primeListForBlockLengthThree.add(1283);
		primeListForBlockLengthThree.add(1289);
		primeListForBlockLengthThree.add(1291);
		primeListForBlockLengthThree.add(1297);
		primeListForBlockLengthThree.add(1301);
		primeListForBlockLengthThree.add(1303);
		primeListForBlockLengthThree.add(1307);
		primeListForBlockLengthThree.add(1319);
		primeListForBlockLengthThree.add(1321);
		primeListForBlockLengthThree.add(1327);
		primeListForBlockLengthThree.add(1361);
		primeListForBlockLengthThree.add(1367);
		primeListForBlockLengthThree.add(1373);
		primeListForBlockLengthThree.add(1381);
		primeListForBlockLengthThree.add(1399);
		primeListForBlockLengthThree.add(1409);
		primeListForBlockLengthThree.add(1423);
		primeListForBlockLengthThree.add(1427);
		primeListForBlockLengthThree.add(1429);
		primeListForBlockLengthThree.add(1433);
		primeListForBlockLengthThree.add(1439);
		primeListForBlockLengthThree.add(1447);
		primeListForBlockLengthThree.add(1451);
		primeListForBlockLengthThree.add(1453);
		primeListForBlockLengthThree.add(1459);
		primeListForBlockLengthThree.add(1471);
		primeListForBlockLengthThree.add(1481);
		primeListForBlockLengthThree.add(1483);
		primeListForBlockLengthThree.add(1487);
		primeListForBlockLengthThree.add(1489);
		primeListForBlockLengthThree.add(1493);
		primeListForBlockLengthThree.add(1499);
		primeListForBlockLengthThree.add(1511);
		primeListForBlockLengthThree.add(1523);
		primeListForBlockLengthThree.add(1531);
		primeListForBlockLengthThree.add(1543);
		primeListForBlockLengthThree.add(1549);
		primeListForBlockLengthThree.add(1553);
		primeListForBlockLengthThree.add(1559);
		primeListForBlockLengthThree.add(1567);
		primeListForBlockLengthThree.add(1571);
		primeListForBlockLengthThree.add(1579);
		primeListForBlockLengthThree.add(1583);
		primeListForBlockLengthThree.add(1597);
		primeListForBlockLengthThree.add(1601);
		primeListForBlockLengthThree.add(1607);
		primeListForBlockLengthThree.add(1609);
		primeListForBlockLengthThree.add(1613);
		primeListForBlockLengthThree.add(1619);
		primeListForBlockLengthThree.add(1621);
		primeListForBlockLengthThree.add(1627);
		primeListForBlockLengthThree.add(1637);
		primeListForBlockLengthThree.add(1657);
		primeListForBlockLengthThree.add(1663);
		primeListForBlockLengthThree.add(1667);
		primeListForBlockLengthThree.add(1669);
		primeListForBlockLengthThree.add(1693);
		primeListForBlockLengthThree.add(1697);
		primeListForBlockLengthThree.add(1699);
		primeListForBlockLengthThree.add(1709);
		primeListForBlockLengthThree.add(1721);
		primeListForBlockLengthThree.add(1723);
		primeListForBlockLengthThree.add(1733);
		primeListForBlockLengthThree.add(1741);
		primeListForBlockLengthThree.add(1747);
		primeListForBlockLengthThree.add(1753);
		primeListForBlockLengthThree.add(1759);
		primeListForBlockLengthThree.add(1777);
		primeListForBlockLengthThree.add(1783);
		primeListForBlockLengthThree.add(1787);
		primeListForBlockLengthThree.add(1789);
		primeListForBlockLengthThree.add(1801);
		primeListForBlockLengthThree.add(1811);
		primeListForBlockLengthThree.add(1823);
		primeListForBlockLengthThree.add(1831);
		primeListForBlockLengthThree.add(1847);
		primeListForBlockLengthThree.add(1861);
		primeListForBlockLengthThree.add(1867);
		primeListForBlockLengthThree.add(1871);
		primeListForBlockLengthThree.add(1873);
		primeListForBlockLengthThree.add(1877);
		primeListForBlockLengthThree.add(1879);
		primeListForBlockLengthThree.add(1889);
		primeListForBlockLengthThree.add(1901);
		primeListForBlockLengthThree.add(1907);
		primeListForBlockLengthThree.add(1913);
		primeListForBlockLengthThree.add(1931);
		primeListForBlockLengthThree.add(1933);
		primeListForBlockLengthThree.add(1949);
		primeListForBlockLengthThree.add(1951);
		primeListForBlockLengthThree.add(1973);
		primeListForBlockLengthThree.add(1979);
		primeListForBlockLengthThree.add(1987);
		primeListForBlockLengthThree.add(1993);
		primeListForBlockLengthThree.add(1997);
		primeListForBlockLengthThree.add(1999);
		primeListForBlockLengthThree.add(2003);
		primeListForBlockLengthThree.add(2011);
		primeListForBlockLengthThree.add(2017);
		primeListForBlockLengthThree.add(2027);
		primeListForBlockLengthThree.add(2029);
		primeListForBlockLengthThree.add(2039);
		primeListForBlockLengthThree.add(2053);
		primeListForBlockLengthThree.add(2063);
		primeListForBlockLengthThree.add(2069);
		primeListForBlockLengthThree.add(2081);
		primeListForBlockLengthThree.add(2083);
		primeListForBlockLengthThree.add(2087);
		primeListForBlockLengthThree.add(2089);
		primeListForBlockLengthThree.add(2099);
		primeListForBlockLengthThree.add(2111);
		primeListForBlockLengthThree.add(2113);
		primeListForBlockLengthThree.add(2129);
		primeListForBlockLengthThree.add(2131);
		primeListForBlockLengthThree.add(2137);
		primeListForBlockLengthThree.add(2141);
		primeListForBlockLengthThree.add(2143);
		primeListForBlockLengthThree.add(2153);
		primeListForBlockLengthThree.add(2161);
		primeListForBlockLengthThree.add(2179);
		primeListForBlockLengthThree.add(2203);
		primeListForBlockLengthThree.add(2207);
		primeListForBlockLengthThree.add(2213);
		primeListForBlockLengthThree.add(2221);
		primeListForBlockLengthThree.add(2237);
		primeListForBlockLengthThree.add(2239);
		primeListForBlockLengthThree.add(2243);
		primeListForBlockLengthThree.add(2251);
		primeListForBlockLengthThree.add(2267);
		primeListForBlockLengthThree.add(2269);
		primeListForBlockLengthThree.add(2273);
		primeListForBlockLengthThree.add(2281);
		primeListForBlockLengthThree.add(2287);
		primeListForBlockLengthThree.add(2293);
		primeListForBlockLengthThree.add(2297);
		primeListForBlockLengthThree.add(2309);
		primeListForBlockLengthThree.add(2311);
		primeListForBlockLengthThree.add(2333);
		primeListForBlockLengthThree.add(2339);
		primeListForBlockLengthThree.add(2341);
		primeListForBlockLengthThree.add(2347);
		primeListForBlockLengthThree.add(2351);
		primeListForBlockLengthThree.add(2357);
		primeListForBlockLengthThree.add(2371);
		primeListForBlockLengthThree.add(2377);
		primeListForBlockLengthThree.add(2381);
		primeListForBlockLengthThree.add(2383);
		primeListForBlockLengthThree.add(2389);
		primeListForBlockLengthThree.add(2393);
		primeListForBlockLengthThree.add(2399);
		primeListForBlockLengthThree.add(2411);
		primeListForBlockLengthThree.add(2417);
		primeListForBlockLengthThree.add(2423);
		primeListForBlockLengthThree.add(2437);
		primeListForBlockLengthThree.add(2441);
		primeListForBlockLengthThree.add(2447);
		primeListForBlockLengthThree.add(2459);
		primeListForBlockLengthThree.add(2467);
		primeListForBlockLengthThree.add(2473);
		primeListForBlockLengthThree.add(2477);
		primeListForBlockLengthThree.add(2503);
		primeListForBlockLengthThree.add(2521);
		primeListForBlockLengthThree.add(2531);
		primeListForBlockLengthThree.add(2539);
		primeListForBlockLengthThree.add(2543);
		primeListForBlockLengthThree.add(2549);
		primeListForBlockLengthThree.add(2551);
		primeListForBlockLengthThree.add(2557);
		primeListForBlockLengthThree.add(2579);
		primeListForBlockLengthThree.add(2591);
		primeListForBlockLengthThree.add(2593);
		primeListForBlockLengthThree.add(2609);
		primeListForBlockLengthThree.add(2617);
		primeListForBlockLengthThree.add(2621);
		primeListForBlockLengthThree.add(2633);
		primeListForBlockLengthThree.add(2647);
		primeListForBlockLengthThree.add(2657);
		primeListForBlockLengthThree.add(2659);
		primeListForBlockLengthThree.add(2663);
		primeListForBlockLengthThree.add(2671);
		primeListForBlockLengthThree.add(2677);
		primeListForBlockLengthThree.add(2683);
		primeListForBlockLengthThree.add(2687);
		primeListForBlockLengthThree.add(2689);
		primeListForBlockLengthThree.add(2693);
		primeListForBlockLengthThree.add(2699);
		primeListForBlockLengthThree.add(2707);
		primeListForBlockLengthThree.add(2711);
		primeListForBlockLengthThree.add(2713);
		primeListForBlockLengthThree.add(2719);
		primeListForBlockLengthThree.add(2729);
		primeListForBlockLengthThree.add(2731);
		primeListForBlockLengthThree.add(2741);
		primeListForBlockLengthThree.add(2749);
		primeListForBlockLengthThree.add(2753);
		primeListForBlockLengthThree.add(2767);
		primeListForBlockLengthThree.add(2777);
		primeListForBlockLengthThree.add(2789);
		primeListForBlockLengthThree.add(2791);
		primeListForBlockLengthThree.add(2797);
		primeListForBlockLengthThree.add(2801);
		primeListForBlockLengthThree.add(2803);
		primeListForBlockLengthThree.add(2819);
		primeListForBlockLengthThree.add(2833);
		primeListForBlockLengthThree.add(2837);
		primeListForBlockLengthThree.add(2843);
		primeListForBlockLengthThree.add(2851);
		primeListForBlockLengthThree.add(2857);
		primeListForBlockLengthThree.add(2861);
		primeListForBlockLengthThree.add(2879);
		primeListForBlockLengthThree.add(2887);
		primeListForBlockLengthThree.add(2897);
		primeListForBlockLengthThree.add(2903);
		primeListForBlockLengthThree.add(2909);
		primeListForBlockLengthThree.add(2917);
		primeListForBlockLengthThree.add(2927);
		primeListForBlockLengthThree.add(2939);
		primeListForBlockLengthThree.add(2953);
		primeListForBlockLengthThree.add(2957);
		primeListForBlockLengthThree.add(2963);
		primeListForBlockLengthThree.add(2969);
		primeListForBlockLengthThree.add(2971);
		primeListForBlockLengthThree.add(2999);
		primeListForBlockLengthThree.add(3001);
		primeListForBlockLengthThree.add(3011);
		primeListForBlockLengthThree.add(3019);
		primeListForBlockLengthThree.add(3023);
		primeListForBlockLengthThree.add(3037);
		primeListForBlockLengthThree.add(3041);
		primeListForBlockLengthThree.add(3049);
		primeListForBlockLengthThree.add(3061);
		primeListForBlockLengthThree.add(3067);
		primeListForBlockLengthThree.add(3079);
		primeListForBlockLengthThree.add(3083);
		primeListForBlockLengthThree.add(3089);
		primeListForBlockLengthThree.add(3109);
		primeListForBlockLengthThree.add(3119);
		primeListForBlockLengthThree.add(3121);
		primeListForBlockLengthThree.add(3137);
		primeListForBlockLengthThree.add(3163);
		primeListForBlockLengthThree.add(3167);
	}

	// 3169 3181 3187 3191 3203 3209 3217 3221 3229 3251 3253 3257 3259 3271
	// 3299 3301 3307 3313 3319 3323 3329 3331 3343 3347 3359 3361 3371 3373
	// 3389 3391 3407 3413 3433 3449 3457 3461 3463 3467 3469 3491 3499 3511
	// 3517 3527 3529 3533 3539 3541 3547 3557 3559 3571 3581 3583 3593 3607
	// 3613 3617 3623 3631 3637 3643 3659 3671 3673 3677 3691 3697 3701 3709
	// 3719 3727 3733 3739 3761 3767 3769 3779 3793 3797 3803 3821 3823 3833
	// 3847 3851 3853 3863 3877 3881 3889 3907 3911 3917 3919 3923 3929 3931
	// 3943 3947 3967 3989 4001 4003 4007 4013 4019 4021 4027 4049 4051 4057
	// 4073 4079 4091 4093 4099 4111 4127 4129 4133 4139 4153 4157 4159 4177
	// 4201 4211 4217 4219 4229 4231 4241 4243 4253 4259 4261 4271 4273 4283
	// 4289 4297 4327 4337 4339 4349 4357 4363 4373 4391 4397 4409 4421 4423
	// 4441 4447 4451 4457 4463 4481 4483 4493 4507 4513 4517 4519 4523 4547
	// 4549 4561 4567 4583 4591 4597 4603 4621 4637 4639 4643 4649 4651 4657
	// 4663 4673 4679 4691 4703 4721 4723 4729 4733 4751 4759 4783 4787 4789
	// 4793 4799 4801 4813 4817 4831 4861 4871 4877 4889 4903 4909 4919 4931
	// 4933 4937 4943 4951 4957 4967 4969 4973 4987 4993 4999 5003 5009 5011
	// 5021 5023 5039 5051 5059 5077 5081 5087 5099 5101 5107 5113 5119 5147
	// 5153 5167 5171 5179 5189 5197 5209 5227 5231 5233 5237 5261 5273 5279
	// 5281 5297 5303 5309 5323 5333 5347 5351 5381 5387 5393 5399 5407 5413
	// 5417 5419 5431 5437 5441 5443 5449 5471 5477 5479 5483 5501 5503 5507
	// 5519 5521 5527 5531 5557 5563 5569 5573 5581 5591 5623 5639 5641 5647
	// 5651 5653 5657 5659 5669 5683 5689 5693 5701 5711 5717 5737 5741 5743
	// 5749 5779 5783 5791 5801 5807 5813 5821 5827 5839 5843 5849 5851 5857
	// 5861 5867 5869 5879 5881 5897 5903 5923 5927 5939 5953 5981 5987 6007
	// 6011 6029 6037 6043 6047 6053 6067 6073 6079 6089 6091 6101 6113 6121
	// 6131 6133 6143 6151 6163 6173 6197 6199 6203 6211 6217 6221 6229 6247
	// 6257 6263 6269 6271 6277 6287 6299 6301 6311 6317 6323 6329 6337 6343
	// 6353 6359 6361 6367 6373 6379 6389 6397 6421 6427 6449 6451 6469 6473
	// 6481 6491 6521 6529 6547 6551 6553 6563 6569 6571 6577 6581 6599 6607
	// 6619 6637 6653 6659 6661 6673 6679 6689 6691 6701 6703 6709 6719 6733
	// 6737 6761 6763 6779 6781 6791 6793 6803 6823 6827 6829 6833 6841 6857
	// 6863 6869 6871 6883 6899 6907 6911 6917 6947 6949 6959 6961 6967 6971
	// 6977 6983 6991 6997 7001 7013 7019 7027 7039 7043 7057 7069 7079 7103
	// 7109 7121 7127 7129 7151 7159 7177 7187 7193 7207 7211 7213 7219 7229
	// 7237 7243 7247 7253 7283 7297 7307 7309 7321 7331 7333 7349 7351 7369
	// 7393 7411 7417 7433 7451 7457 7459 7477 7481 7487 7489 7499 7507 7517
	// 7523 7529 7537 7541 7547 7549 7559 7561 7573 7577 7583 7589 7591 7603
	// 7607 7621 7639 7643 7649 7669 7673 7681 7687 7691 7699 7703 7717 7723
	// 7727 7741 7753 7757 7759 7789 7793 7817 7823 7829 7841 7853 7867 7873
	// 7877 7879 7883 7901 7907 7919

	private static Character getKeyFromValue(HashMap<Character, Integer> hm,
			Integer value) {
		for (Character object : hm.keySet()) {
			if (hm.get(object).equals(value)) {
				return object;
			}
		}
		return null;
	}
}
