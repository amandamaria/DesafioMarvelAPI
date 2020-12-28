--IMAGES
INSERT INTO image(id,type,url) VALUES (1, 'JPG', 'https://randomwordgenerator.com/img/picture-generator/54e9d4464357ab14f1dc8460962e33791c3ad6e04e507440772d73d69e44cc_640.jpg');

--COMICS
INSERT INTO comic(id, description, isbn, page_count, title, image_thumbnail_id) VALUES (1,'Lorem Ipsum is simply dummy text of the printing and typesetting industry','0-3981-2356-X',92,'Comic book 1',1);
INSERT INTO comic(id, description, isbn, page_count, title, image_thumbnail_id) VALUES (2,'Lorem Ipsum has been the industry'' standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book','0-4413-6465-9',19,'Comic book 2',1);
INSERT INTO comic(id, description, isbn, page_count, title, image_thumbnail_id) VALUES (3,'It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged','0-2049-8072-0',64,'Comic book 3',1);
INSERT INTO comic(id, description, isbn, page_count, title, image_thumbnail_id) VALUES (4,'It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum','0-1624-2333-0',41,'Comic book 4',1);
INSERT INTO comic(id, description, isbn, page_count, title, image_thumbnail_id) VALUES (5,'Contrary to popular belief, Lorem Ipsum is not simply random text. It has roots in a piece of classical Latin literature from 45 BC, making it over 2000 years old','0-7449-2648-3',20,'Comic book 5',1);
INSERT INTO comic(id, description, isbn, page_count, title, image_thumbnail_id) VALUES (6,'Richard McClintock, a Latin professor at Hampden-Sydney College in Virginia, looked up one of the more obscure Latin words, consectetur, from a Lorem Ipsum passage, and going through the cites of the word in classical literature, discovered the undoubtable source','0-6339-2095-9',28,'Comic book 6',1);
INSERT INTO comic(id, description, isbn, page_count, title, image_thumbnail_id) VALUES (7,'Lorem Ipsum comes from sections 1.10.32 and 1.10.33 of "de Finibus Bonorum et Malorum" (The Extremes of Good and Evil) by Cicero, written in 45 BC','0-8600-0500-3',92,'Comic book 7',1);
INSERT INTO comic(id, description, isbn, page_count, title, image_thumbnail_id) VALUES (8,'The standard chunk of Lorem Ipsum used since the 1500s is reproduced below for those interested','0-4582-3083-9',97,'Comic book 8',1);
INSERT INTO comic(id, description, isbn, page_count, title, image_thumbnail_id) VALUES (9,'There are many variations of passages of Lorem Ipsum available, but the majority have suffered alteration in some form, by injected humour, or randomised words which don''t look even slightly believable','0-8902-2329-7',70,'Comic book 9',1);
INSERT INTO comic(id, description, isbn, page_count, title, image_thumbnail_id) VALUES (10,'If you are going to use a passage of Lorem Ipsum, you need to be sure there isn''t anything embarrassing hidden in the middle of text','0-2267-3897-3',92,'Comic book 10',1);


--EVENTS
INSERT INTO event(id, description, end_date, start_date, title, image_thumbnail_id) VALUES (1,'It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged','2000-05-12','1990-01-12','Event 1',1);
INSERT INTO event(id, description, end_date, start_date, title, image_thumbnail_id) VALUES (2,'It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum','1990-05-13','1980-12-13','Event 2',1);
INSERT INTO event(id, description, end_date, start_date, title, image_thumbnail_id) VALUES (3,'Contrary to popular belief, Lorem Ipsum is not simply random text. It has roots in a piece of classical Latin literature from 45 BC, making it over 2000 years old','2015-05-14','2009-08-14','Event 3',1);

--STORIES
INSERT INTO story(id, description, title, type, image_thumbnail_id) VALUES (1,'It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged','Story 1','Type X',1);
INSERT INTO story(id, description, title, type, image_thumbnail_id) VALUES (2,'It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum','Story 2','Type Y',1);
INSERT INTO story(id, description, title, type, image_thumbnail_id) VALUES (3,'Contrary to popular belief, Lorem Ipsum is not simply random text. It has roots in a piece of classical Latin literature from 45 BC, making it over 2000 years old','Story 3','Type Z',1);

--SERIES
INSERT INTO series(id, description, end_date, start_date, title, image_thumbnail_id) VALUES (1,'It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged','2010-05-22','1980-01-12','Series 1',1);
INSERT INTO series(id, description, end_date, start_date, title, image_thumbnail_id) VALUES (2,'It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum','1992-05-15','1987-12-13','Series 2',1);
INSERT INTO series(id, description, end_date, start_date, title, image_thumbnail_id) VALUES (3,'Contrary to popular belief, Lorem Ipsum is not simply random text. It has roots in a piece of classical Latin literature from 45 BC, making it over 2000 years old','2017-05-03','2004-08-14','Series 3',1);

--CHARACTERS
INSERT INTO "character" (id, description,name, urls, image_thumbnail_id) VALUES (1,'Contrary to popular belief, Lorem Ipsum is not simply random text. It has roots in a piece of classical Latin literature from 45 BC, making it over 2000 years old','Capitão América','https://pt.wikipedia.org/wiki/Capit%C3%A3o_Am%C3%A9rica',1);
INSERT INTO "character" (id, description,name, urls, image_thumbnail_id) VALUES (2,'Richard McClintock, a Latin professor at Hampden-Sydney College in Virginia, looked up one of the more obscure Latin words, consectetur, from a Lorem Ipsum passage, and going through the cites of the word in classical literature, discovered the undoubtable source','Homem de Ferro','https://pt.wikipedia.org/wiki/Homem_de_Ferro',1);
INSERT INTO "character" (id, description,name, urls, image_thumbnail_id) VALUES (3,'Lorem Ipsum comes from sections 1.10.32 and 1.10.33 of "de Finibus Bonorum et Malorum" (The Extremes of Good and Evil) by Cicero, written in 45 BC. This book is a treatise on the theory of ethics, very popular during the Renaissance','Viúva Negra','https://pt.wikipedia.org/wiki/Vi%C3%BAva_Negra_(Marvel_Comics)',1);
INSERT INTO "character" (id, description,name, urls, image_thumbnail_id) VALUES (4,'The standard chunk of Lorem Ipsum used since the 1500s is reproduced below for those interested','Hulk','https://pt.wikipedia.org/wiki/Hulk',1);
INSERT INTO "character" (id, description,name, urls, image_thumbnail_id) VALUES (5,'There are many variations of passages of Lorem Ipsum available, but the majority have suffered alteration in some form, by injected humour, or randomised words which don''t look even slightly believable','Gavião Arqueiro','https://pt.wikipedia.org/wiki/Gavi%C3%A3o_Arqueiro',1);
INSERT INTO "character" (id, description,name, urls, image_thumbnail_id) VALUES (6,'If you are going to use a passage of Lorem Ipsum, you need to be sure there isn''t anything embarrassing hidden in the middle of text','Thor','https://pt.wikipedia.org/wiki/Thor',1);

--CHARACTERS COMICS
INSERT INTO character_comics(marvel_character_id, comics_id) VALUES (1,1);
INSERT INTO character_comics(marvel_character_id, comics_id) VALUES (2,2);
INSERT INTO character_comics(marvel_character_id, comics_id) VALUES (3,3);
INSERT INTO character_comics(marvel_character_id, comics_id) VALUES (4,4);
INSERT INTO character_comics(marvel_character_id, comics_id) VALUES (5,5);
INSERT INTO character_comics(marvel_character_id, comics_id) VALUES (6,6);
INSERT INTO character_comics(marvel_character_id, comics_id) VALUES (1,7);
INSERT INTO character_comics(marvel_character_id, comics_id) VALUES (2,8);
INSERT INTO character_comics(marvel_character_id, comics_id) VALUES (3,9);
INSERT INTO character_comics(marvel_character_id, comics_id) VALUES (4,10);
INSERT INTO character_comics(marvel_character_id, comics_id) VALUES (5,1);
INSERT INTO character_comics(marvel_character_id, comics_id) VALUES (6,2);
INSERT INTO character_comics(marvel_character_id, comics_id) VALUES (1,3);
INSERT INTO character_comics(marvel_character_id, comics_id) VALUES (2,4);
INSERT INTO character_comics(marvel_character_id, comics_id) VALUES (3,5);
INSERT INTO character_comics(marvel_character_id, comics_id) VALUES (4,6);
INSERT INTO character_comics(marvel_character_id, comics_id) VALUES (5,7);
INSERT INTO character_comics(marvel_character_id, comics_id) VALUES (6,8);
INSERT INTO character_comics(marvel_character_id, comics_id) VALUES (1,9);
INSERT INTO character_comics(marvel_character_id, comics_id) VALUES (2,10);

--CHARACTERS EVENTS
INSERT INTO character_events(marvel_character_id, events_id) VALUES (1,1);
INSERT INTO character_events(marvel_character_id, events_id) VALUES (2,2);
INSERT INTO character_events(marvel_character_id, events_id) VALUES (3,3);
INSERT INTO character_events(marvel_character_id, events_id) VALUES (4,1);
INSERT INTO character_events(marvel_character_id, events_id) VALUES (5,2);
INSERT INTO character_events(marvel_character_id, events_id) VALUES (6,3);
INSERT INTO character_events(marvel_character_id, events_id) VALUES (1,3);
INSERT INTO character_events(marvel_character_id, events_id) VALUES (2,1);
INSERT INTO character_events(marvel_character_id, events_id) VALUES (3,2);
INSERT INTO character_events(marvel_character_id, events_id) VALUES (4,3);
INSERT INTO character_events(marvel_character_id, events_id) VALUES (5,1);
INSERT INTO character_events(marvel_character_id, events_id) VALUES (6,2);

--CHARACTERS SERIES
INSERT INTO character_series(marvel_character_id, series_id) VALUES (1,1);
INSERT INTO character_series(marvel_character_id, series_id) VALUES (2,2);
INSERT INTO character_series(marvel_character_id, series_id) VALUES (3,3);
INSERT INTO character_series(marvel_character_id, series_id) VALUES (4,1);
INSERT INTO character_series(marvel_character_id, series_id) VALUES (5,2);
INSERT INTO character_series(marvel_character_id, series_id) VALUES (6,3);
INSERT INTO character_series(marvel_character_id, series_id) VALUES (1,3);
INSERT INTO character_series(marvel_character_id, series_id) VALUES (2,1);
INSERT INTO character_series(marvel_character_id, series_id) VALUES (3,2);
INSERT INTO character_series(marvel_character_id, series_id) VALUES (4,3);
INSERT INTO character_series(marvel_character_id, series_id) VALUES (5,1);
INSERT INTO character_series(marvel_character_id, series_id) VALUES (6,2);

--CHARACTERS STORIES
INSERT INTO character_stories(marvel_character_id, stories_id) VALUES (1,1);
INSERT INTO character_stories(marvel_character_id, stories_id) VALUES (2,2);
INSERT INTO character_stories(marvel_character_id, stories_id) VALUES (3,3);
INSERT INTO character_stories(marvel_character_id, stories_id) VALUES (4,1);
INSERT INTO character_stories(marvel_character_id, stories_id) VALUES (5,2);
INSERT INTO character_stories(marvel_character_id, stories_id) VALUES (6,3);
INSERT INTO character_stories(marvel_character_id, stories_id) VALUES (1,3);
INSERT INTO character_stories(marvel_character_id, stories_id) VALUES (2,1);
INSERT INTO character_stories(marvel_character_id, stories_id) VALUES (3,2);
INSERT INTO character_stories(marvel_character_id, stories_id) VALUES (4,3);
INSERT INTO character_stories(marvel_character_id, stories_id) VALUES (5,1);
INSERT INTO character_stories(marvel_character_id, stories_id) VALUES (6,2);
