-- Write queries to return the following:
-- The following changes are applied to the "dvdstore" database.**

-- 1. Add actors, Hampton Avenue, and Lisa Byway to the actor table.
insert into actor (first_name, last_name) values ('Hampton', 'Avenue');
insert into actor (first_name, last_name) values ('Lisa', 'Byway');
select * from actor where last_name = 'Avenue';
select * from actor where last_name = 'Byway';

-- 2. Add "Euclidean PI", "The epic story of Euclid as a pizza delivery boy in
-- ancient Greece", to the film table. The movie was released in 2008 in English.
-- Since its an epic, the run length is 3hrs and 18mins. There are no special
-- features, the film speaks for itself, and doesn't need any gimmicks.
select * from language;

insert into film (title, description, release_year, language_id, original_language_id, length)
values ('Euclidean PI', 'The epic story of Euclid as a pizza delivery boy in ancient Greece', 2008, 1, 1, 198);

select * from film where title = 'Euclidean PI';

-- 3. Hampton Avenue plays Euclid, while Lisa Byway plays his slightly
-- overprotective mother, in the film, "Euclidean PI". Add them to the film.
select * from film where title = 'Euclidean PI';
select * from actor where last_name = 'Avenue';
select * from actor where last_name = 'Byway';

insert into film_actor (film_id, actor_id) values (1001, 201);
insert into film_actor (film_id, actor_id) values (1001, 202);

select * from film_actor where film_id = 1001; 

-- 4. Add Mathmagical to the category table.
select * from category;

insert into category (name) values ('Mathmagical');

select * from category;                                 -- 17

-- 5. Assign the Mathmagical category to the following films, "Euclidean PI",
-- "EGG IGBY", "KARATE MOON", "RANDOM GO", and "YOUNG LANGUAGE"
select * from film where title = 'Euclidean PI';        -- 1001
select * from film where title = 'EGG IGBY';            -- 274
select * from film where title = 'KARATE MOON';         -- 494
select * from film where title = 'RANDOM GO';           -- 714
select * from film where title = 'YOUNG LANGUAGE';      -- 996

update film_category set category_id = 17 where film_id = 274;
update film_category set category_id = 17 where film_id = 494;
update film_category set category_id = 17 where film_id = 714;
update film_category set category_id = 17 where film_id = 996;
insert into film_category (film_id, category_id) values (1001, 17);

select * from film_category where film_id in (1001, 274, 494, 714, 996);

-- 6. Mathmagical films always have a "G" rating, adjust all Mathmagical films
-- accordingly.
-- (5 rows affected)
select *
from film
join film_category on film.film_id = film_category.film_id
where film_category.category_id = 17;

update film
set rating = 'G'
from film_category
where film_category.category_id = 17;

-- 7. Add a copy of "Euclidean PI" to all the stores.

-- 8. The Feds have stepped in and have impounded all copies of the pirated film,
-- "Euclidean PI". The film has been seized from all stores, and needs to be
-- deleted from the film table. Delete "Euclidean PI" from the film table.
-- (Did it succeed? Why?)
-- <YOUR ANSWER HERE>

-- 9. Delete Mathmagical from the category table.
-- (Did it succeed? Why?)
-- <YOUR ANSWER HERE>

-- 10. Delete all links to Mathmagical in the film_category tale.
-- (Did it succeed? Why?)
-- <YOUR ANSWER HERE>

-- 11. Retry deleting Mathmagical from the category table, followed by retrying
-- to delete "Euclidean PI".
-- (Did either deletes succeed? Why?)
-- <YOUR ANSWER HERE>

-- 12. Check database metadata to determine all constraints of the film id, and
-- describe any remaining adjustments needed before the film "Euclidean PI" can
-- be removed from the film table.
