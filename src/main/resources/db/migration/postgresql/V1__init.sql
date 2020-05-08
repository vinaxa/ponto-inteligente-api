CREATE TABLE empresa (
  id serial primary key not null,
  cnpj varchar(255) NOT NULL,
  data_atualizacao Timestamp without Time Zone NOT NULL,
  data_criacao Timestamp without Time Zone NOT NULL,
  razao_social varchar(255) NOT NULL
);

CREATE TABLE funcionario (
  id serial primary key not null,
  cpf varchar(255) NOT NULL,
  data_atualizacao Timestamp without Time Zone NOT NULL,
  data_criacao Timestamp without Time Zone NOT NULL,
  email varchar(255) NOT NULL,
  nome varchar(255) NOT NULL,
  perfil varchar(255) NOT NULL,
  qtd_horas_almoco float DEFAULT NULL,
  qtd_horas_trabalho_dia float DEFAULT NULL,
  senha varchar(255) NOT NULL,
  valor_hora decimal(19,2) DEFAULT NULL,
  empresa_id bigint DEFAULT NULL
);

CREATE TABLE lancamento (
  id serial primary key not null,
  data Timestamp without Time Zone NOT NULL,
  data_atualizacao Timestamp without Time Zone NOT NULL,
  data_criacao Timestamp without Time Zone NOT NULL,
  descricao varchar(255) DEFAULT NULL,
  localizacao varchar(255) DEFAULT NULL,
  tipo varchar(255) NOT NULL,
  funcionario_id bigint DEFAULT NULL
);