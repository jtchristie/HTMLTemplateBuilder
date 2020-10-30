package lab4;
import javax.swing.*;
import java.io.IOException;

public class Table extends HTML {
    private int rows;
    private int columns;

    public Table(){

    }

    public void setRows(int rows){
        this.rows = rows;
    }
    public int getRows(){
        return rows;
    }

    public void setColumns(int columns){
        this.columns = columns;
    }

    public int getColumns(){
        return columns;
    }

    public String getHTML() throws IOException {
        StringBuilder msg = new StringBuilder();
        msg.append("<html>\n" +
                "<head>\n" +
                "<style>\n" +
                "table {\n" +
                "  font-family: arial, sans-serif;\n" +
                "  border-collapse: collapse;\n" +
                "  width: 100%;\n" +
                "}\n" +
                "\n" +
                "td, th {\n" +
                "  border: 1px solid #dddddd;\n" +
                "  text-align: left;\n" +
                "  padding: 8px;\n" +
                "}\n" +
                "\n" +
                "tr:nth-child(even) {\n" +
                "  background-color: #dddddd;\n" +
                "}\n" +
                "</style>\n" +
                "</head>\n" +
                "<body>");

        msg.append("\n<table>\n");
        msg.append("    <tr>\n");

        for (int i = 1; i <= columns; i++){
            String columnName = JOptionPane.showInputDialog("Enter column " + i + " name");
            msg.append("        <th> " ).append(columnName).append(" </th>\n");
        }

        msg.append("    <tr>\n");

            for (int j = 1; j <= rows; j++){
                msg.append("<!-- row: ").append(j).append(" -->\n");
                msg.append("    <tr>\n");
                msg.append("      <td> Add data </td>\n".repeat(Math.max(0, columns)));
                msg.append("    </tr>\n");
            }


        msg.append("</table>\n");
        msg.append("</body>\n");
        msg.append("</html>");
        String htmlString = msg.toString();
        Save.save(htmlString);

        return msg.toString();
    }
}
