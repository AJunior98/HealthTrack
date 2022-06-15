# Health Track

Este é um projeto que exemplifica a aplicação dos conceitos de servlet, juntamente com persistência de dados.

Neste projeto contém uma validação de login, caso o usuário não esteja cadastrado no banco de dados ele é redirecionado para pagina de cadastro.

Obs: Esté não é um projeto totalmente funcional, ele é só uma forma de aplicar os conhecimentos aprendidos na faculdade.

## Especificações da classe utilizada

As classes do tipo servlet criadas para fazer funcionar a ideia, estão destacadas em vermelho na imagem abaixo:

![image](https://user-images.githubusercontent.com/100853329/173805566-5d5cf677-e04a-4d2a-aac8-4f9bf2f99348.png)

- Classe "LoginServlet.java" = É responsável por receber o request do navegador e fazer a consulta no banco de dados para validar se as informações disponibilizadas estão corretas.
- Classe "RegisterServlet.java" = É responsavel por fazer o insert no banco de dados de um usuário, caso não tenha nenhum cadastro.

## Modelagem de dados do projeto
Abaixo a modelagem de dados do projeto:

![image](https://user-images.githubusercontent.com/100853329/173806952-474bebdf-3a02-41c9-8c01-b3c65e16428c.png)

![image](https://user-images.githubusercontent.com/100853329/173807175-642f9c0a-d011-43d4-b51d-d45f0824116a.png)

## Dados utilizados no projeto
Como é um projeto de teste, a intenção é repetir todos os conceitos aprendidos nas aulas. Abaixo, um possivel seed montado a partir de uma modelagem no BD oracle.
```
-- Gerado por Oracle SQL Developer Data Modeler 21.2.0.183.1957
--   em:        2022-06-12 19:30:13 BRT
--   site:      Oracle Database 11g
--   tipo:      Oracle Database 11g
-- predefined type, no DDL - MDSYS.SDO_GEOMETRY
-- predefined type, no DDL - XMLTYPE
CREATE TABLE t_htr_alimentacao (
    id_alimento             NUMBER(3) NOT NULL,
    t_htr_dia_id_dia        NUMBER(4) NOT NULL,
    t_htr_dia_id_user       NUMBER(4) NOT NULL,
    t_htr_obs_id_observacao NUMBER(2) NOT NULL,
    nm_alimento             VARCHAR2(30),
    nr_quantidade           NUMBER(2),
    nr_calorias_ingeridas   NUMBER(5)
);
ALTER TABLE t_htr_alimentacao
    ADD CONSTRAINT t_htr_alimentacao_pk PRIMARY KEY ( id_alimento,
                                                      t_htr_dia_id_dia,
                                                      t_htr_dia_id_user );
CREATE TABLE t_htr_dado (
    id_cpf             NUMBER(11) NOT NULL,
    t_htr_user_id_user NUMBER(4) NOT NULL,
    dt_nasc            DATE NOT NULL,
    nr_peso            NUMBER(3, 1) NOT NULL,
    nr_altura          NUMBER(3, 2) NOT NULL,
    nm_sexo            VARCHAR2(9) NOT NULL,
    nr_telefone        NUMBER(11) NOT NULL
);
CREATE UNIQUE INDEX t_htr_dado__idx ON
    t_htr_dado (
        t_htr_user_id_user
    ASC );
ALTER TABLE t_htr_dado ADD CONSTRAINT t_htr_dado_pk PRIMARY KEY ( id_cpf );
CREATE TABLE t_htr_dia (
    id_dia             NUMBER(4) NOT NULL,
    t_htr_user_id_user NUMBER(4) NOT NULL,
    dt_dias_semana     DATE NOT NULL
);
ALTER TABLE t_htr_dia ADD CONSTRAINT t_htr_dia_pk PRIMARY KEY ( id_dia,
                                                                t_htr_user_id_user );
CREATE TABLE t_htr_exerc (
    id_exercicio            NUMBER(1) NOT NULL,
    t_htr_dia_id_dia        NUMBER(4) NOT NULL,
    t_htr_dia_id_user       NUMBER(4) NOT NULL,
    t_htr_obs_id_observacao NUMBER(2) NOT NULL,
    nr_duracao              NUMBER,
    tp_distancia            NUMBER(5),
    nr_calorias             NUMBER(5),
    nm_intensidade          VARCHAR2(15)
);
ALTER TABLE t_htr_exerc
    ADD CONSTRAINT t_htr_exerc_pk PRIMARY KEY ( id_exercicio,
                                                t_htr_dia_id_dia,
                                                t_htr_dia_id_user );
CREATE TABLE t_htr_obs (
    id_observacao NUMBER(2) NOT NULL,
    ob_comentario VARCHAR2(250)
);
ALTER TABLE t_htr_obs ADD CONSTRAINT t_htr_obs_pk PRIMARY KEY ( id_observacao );
CREATE TABLE t_htr_peso (
    id_peso                 NUMBER(3) NOT NULL,
    t_htr_dia_id_dia        NUMBER(4) NOT NULL,
    t_htr_dia_id_user       NUMBER(4) NOT NULL,
    t_htr_obs_id_observacao NUMBER(2) NOT NULL,
    nr_peso_atual           NUMBER(3, 1)
);
CREATE UNIQUE INDEX t_htr_peso__idx ON
    t_htr_peso (
        t_htr_dia_id_dia
    ASC,
        t_htr_dia_id_user
    ASC );
ALTER TABLE t_htr_peso ADD CONSTRAINT t_htr_peso_pk PRIMARY KEY ( id_peso );
CREATE TABLE t_htr_user (
    id_user          NUMBER(4) NOT NULL,
    nm_primeiro_nome VARCHAR2(20) NOT NULL,
    nm_ultimo_nome   VARCHAR2(20) NOT NULL,
    ds_email         VARCHAR2(30) NOT NULL,
    ds_senha         VARCHAR2(30) NOT NULL
);
ALTER TABLE t_htr_user ADD CONSTRAINT t_htr_user_pk PRIMARY KEY ( id_user );
ALTER TABLE t_htr_alimentacao
    ADD CONSTRAINT t_htr_alimentacao_t_htr_dia_fk FOREIGN KEY ( t_htr_dia_id_dia,
                                                                t_htr_dia_id_user )
        REFERENCES t_htr_dia ( id_dia,
                               t_htr_user_id_user );
ALTER TABLE t_htr_alimentacao
    ADD CONSTRAINT t_htr_alimentacao_t_htr_obs_fk FOREIGN KEY ( t_htr_obs_id_observacao )
        REFERENCES t_htr_obs ( id_observacao );
ALTER TABLE t_htr_dado
    ADD CONSTRAINT t_htr_dado_t_htr_user_fk FOREIGN KEY ( t_htr_user_id_user )
        REFERENCES t_htr_user ( id_user );
ALTER TABLE t_htr_dia
    ADD CONSTRAINT t_htr_dia_t_htr_user_fk FOREIGN KEY ( t_htr_user_id_user )
        REFERENCES t_htr_user ( id_user );
ALTER TABLE t_htr_exerc
    ADD CONSTRAINT t_htr_exerc_t_htr_dia_fk FOREIGN KEY ( t_htr_dia_id_dia,
                                                          t_htr_dia_id_user )
        REFERENCES t_htr_dia ( id_dia,
                               t_htr_user_id_user );
ALTER TABLE t_htr_exerc
    ADD CONSTRAINT t_htr_exerc_t_htr_obs_fk FOREIGN KEY ( t_htr_obs_id_observacao )
        REFERENCES t_htr_obs ( id_observacao );
ALTER TABLE t_htr_peso
    ADD CONSTRAINT t_htr_peso_t_htr_dia_fk FOREIGN KEY ( t_htr_dia_id_dia,
                                                         t_htr_dia_id_user )
        REFERENCES t_htr_dia ( id_dia,
                               t_htr_user_id_user );
ALTER TABLE t_htr_peso
    ADD CONSTRAINT t_htr_peso_t_htr_obs_fk FOREIGN KEY ( t_htr_obs_id_observacao )
        REFERENCES t_htr_obs ( id_observacao );
-- Relatório do Resumo do Oracle SQL Developer Data Modeler: 
-- 
-- CREATE TABLE                             7
-- CREATE INDEX                             2
-- ALTER TABLE                             15
-- CREATE VIEW                              0
-- ALTER VIEW                               0
-- CREATE PACKAGE                           0
-- CREATE PACKAGE BODY                      0
-- CREATE PROCEDURE                         0
-- CREATE FUNCTION                          0
-- CREATE TRIGGER                           0
-- ALTER TRIGGER                            0
-- CREATE COLLECTION TYPE                   0
-- CREATE STRUCTURED TYPE                   0
-- CREATE STRUCTURED TYPE BODY              0
-- CREATE CLUSTER                           0
-- CREATE CONTEXT                           0
-- CREATE DATABASE                          0
-- CREATE DIMENSION                         0
-- CREATE DIRECTORY                         0
-- CREATE DISK GROUP                        0
-- CREATE ROLE                              0
-- CREATE ROLLBACK SEGMENT                  0
-- CREATE SEQUENCE                          0
-- CREATE MATERIALIZED VIEW                 0
-- CREATE MATERIALIZED VIEW LOG             0
-- CREATE SYNONYM                           0
-- CREATE TABLESPACE                        0
-- CREATE USER                              0
-- 
-- DROP TABLESPACE                          0
-- DROP DATABASE                            0
-- 
-- REDACTION POLICY                         0
-- 
-- ORDS DROP SCHEMA                         0
-- ORDS ENABLE SCHEMA                       0
-- ORDS ENABLE OBJECT                       0
-- 
-- ERRORS                                   0
-- WARNINGS                                 0
```


