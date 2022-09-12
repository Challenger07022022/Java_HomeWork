package HomeWork2;

// 2. Дана строка sql-запроса "select * from students where ". Сформируйте часть WHERE этого запроса,
// используя StringBuilder. Данные для фильтрации приведены ниже в виде json строки. Если значение null,
// то параметр не должен попадать в запрос. Параметры для фильтрации:
// {"name":"Ivanov", "country":"Russia","city":"Moscow", "age":"null"}
//
// Ответ: "select * from students where name = 'Ivanov' and country = 'Russia'
// and city = 'Moscow'" для приведенного примера


import org.json.JSONObject;

public class Task2 {
    public static void main(String[] args) {
        String text = "select * from students where ";
        String resultJson = "{\"name\":\"Ivanov\", \"country\":\"Russia\",\"city\":\"Moscow\", \"age\":\"null\"}";
        JSONObject jsonObj = new JSONObject(resultJson);
        StringBuilder sb = new StringBuilder();
        sb.append(text);
        String[] str = {"name", "country", "city", "age"};
        for (int i = 0; i < jsonObj.length(); i++) {
            if (jsonObj.get(str[i]).equals("null") == false) {
                sb.append(str[i] + " = " + "'" + jsonObj.get(str[i]) + "'");
            }
            if ((i + 1) < jsonObj.length() && jsonObj.get(str[i+1]).equals("null") == false)
                sb.append(" and ");
        }
        System.out.println(sb);
    }
}
