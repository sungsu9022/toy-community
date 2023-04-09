CREATE TABLE `user` (
  `id` int NOT NULL AUTO_INCREMENT COMMENT '계정 아이디',
  `external_id` varchar(36)  NOT NULL COMMENT '외부용 ID',
  `email` varchar(1000) NOT NULL COMMENT '이메일',
  `password` varchar(1000) NOT NULL COMMENT '패스워드',
  `created_at` datetime NOT NULL COMMENT '등록 일자',
  `updated_at` datetime NOT NULLCOMMENT '수정 일자',
  PRIMARY KEY (`id`),
  UNIQUE KEY `email` (`email`),
  UNIQUE KEY `ix_users_external_id` (`external_id`)
) ENGINE=InnoDB
