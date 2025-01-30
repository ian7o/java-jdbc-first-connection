import java.sql.SQLException;

public class QueryController {
    public void QueryController() throws SQLException {
        SelectQuery selectQuery = new SelectQuery();
        selectQuery.selectQueryTest();

//        InsertInDB insertInDB = new InsertInDB();
//        insertInDB.newInsertion();

//        Transations insertTransations = new Transations();
//        insertTransations.transations();

//        OutherTransationsTest outherTransationsTest = new OutherTransationsTest();
//        outherTransationsTest.transTest();
    }
}