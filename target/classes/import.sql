

  	insert into previsoes (min, max, hum, des, data, hora, latitude, longitude) values (21.0, 31.0, 73.0, 'alta chance de chuva','14/9/2019', 22.45, 180.55, 55.27 );
	insert into dias (semana) values ('sexta');

	
	update previsoes set dia = 1 where id = 1;
	update dias set previsao = 1 where id = 1;
	-- insert into previsoes (pDia, semana, min, max, hum, des, data, hora, latitude, longitude) values ('Sexta', 20.0, 33.0, 90.0, 'alta chance de chuvas fortes','15/9/2019', 16.35, 80.23, 65.98);
--insert into previsoes (id, dia, Min, Max, hum, des, data, hora, latitude, longitude) values (3, 'Domingo', 18.0, 31.0, 63.0, 'pouca chance de chuva','16/9/2019', 10.15, 90.55, 75.88);


--adicione um usuário
insert into usuario (id, login, senha) values (1, 'admin', 'admin');







--Update table1 set (a,b,c,d,e,f,g,h,i,j,k)=
--(t2.a,t2.b,t2.c,t2.d,t2.e,t2.f,t2.g,t2.h,t2.i,t2.j,t2.k)
--from table2 t2
--where table1.id=table2.id
