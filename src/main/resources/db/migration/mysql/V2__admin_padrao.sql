INSERT INTO `empresa` (`id`,`cnpj`,`data_atualizacao`,`data_criacao`,`razao_social`) 
VALUES (null, '82198127000121', CURRENT_DATE(), CURRENT_DATE(), 'Raphao IT');

INSERT INTO `funcionario` (`id`,`cpf`,`data_atualizacao`,`data_criacao`,`email`,`nome`,
`perfil`,`qtd_horas_almoco`,`qtd_horas_trabalho_dia`,`senha`,`valor_hora`,`empresa_id`) 
VALUES (null, '02047575095', CURRENT_DATE(), CURRENT_DATE(), 'rapha.oo.torres@gmail.com','ADMIN','ROLE_ADMIN', NULL, NULL,
'$2a$10$RslTfiTr51fFmHm/NdWSWeN6ogy3abDCCEnmSqqB7VlXxm7NBTsnq',NULL, 
(SELECT `id` FROM `empresa` WHERE `cnpj` = '82198127000121'));
