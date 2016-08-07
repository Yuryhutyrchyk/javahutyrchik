package i18nAndl10n;

/**
 * Replacement tags
 * 
 * @author Yura
 */

import java.util.regex.Pattern;

public class Tegs {

	public static void main(String[] args) {
		String text = "Ќаписать  программу,  выполн€ющую  поиск  в  строке  всех  тегов  абзацев,  в  т.ч.  тех,  у  которых  есть  параметры,  например  <p  id=Фp1Ф>,  и замену их на простые теги абзацев <p> (атрибуты игнорируем).";
		System.out.println("Was: "+text+"\n");
		String elementChange = "<p>";
		String elementSearch = "<[pP].*?>";
		String newText = Pattern.compile(elementSearch).matcher(text).replaceAll(elementChange);
		System.out.println("After change: "+newText);
	}
}