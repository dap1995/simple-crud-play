package models;

/**
 * Created by dap on 14/10/15.
 */

import java.util.List;
import play.db.*;
import play.db.ebean.Model;
import play.api.db.DB;
import javax.persistence.*;


@Entity
public class Cliente extends Model {
    @Id @GeneratedValue
    private long id;
    private String descricao;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public long getId() {
        return id;
    }

    public Cliente() {
        super();
    }

    public Cliente(String descricao) {
        this.descricao = descricao;
    }
}
