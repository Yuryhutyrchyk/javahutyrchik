package i18nAndl10n;

/**
 * Replacement tags
 * 
 * @author Yura
 */

import java.util.regex.Pattern;

public class Tegs {

	public static void main(String[] args) {
		String text = "��������  ���������,  �����������  �����  �  ������  ����  �����  �������,  �  �.�.  ���,  �  �������  ����  ���������,  ��������  <p  id=�p1�>,  � ������ �� �� ������� ���� ������� <p> (�������� ����������).";
		System.out.println("Was: "+text+"\n");
		String elementChange = "<p>";
		String elementSearch = "<[pP].*?>";
		String newText = Pattern.compile(elementSearch).matcher(text).replaceAll(elementChange);
		System.out.println("After change: "+newText);
	}
}