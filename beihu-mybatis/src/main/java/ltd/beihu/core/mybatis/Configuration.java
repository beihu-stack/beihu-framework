package ltd.beihu.core.mybatis;

import java.util.Map;

/**
 * Configuration to store {@code MappedStatement}
 * @author Adam
 * @since 2019/12/7
 */
public class Configuration {

    /**
     * key MappedStatement.id
     */
    private Map<String, MappedStatement> mappedStatements;

    public void addMappedStatement(MappedStatement mappedStatement) {
        mappedStatements.put(mappedStatement.getId(), mappedStatement);
    }

    public MappedStatement getMappedStatement(String id) {
        return mappedStatements.get(id);
    }

    public boolean hasMappedStatement(String id) {
        return mappedStatements.containsKey(id);
    }

}
