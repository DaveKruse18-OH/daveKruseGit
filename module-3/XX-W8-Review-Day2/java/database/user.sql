-- ********************************************************************************
-- This script creates the database users and grants them the necessary permissions
-- ********************************************************************************

CREATE USER te_owner
WITH PASSWORD 'tebucks';

GRANT ALL
ON ALL TABLES IN SCHEMA public
TO te_owner;

GRANT ALL
ON ALL SEQUENCES IN SCHEMA public
TO te_owner;

CREATE USER te_appuser
WITH PASSWORD 'tebucks';

GRANT SELECT, INSERT, UPDATE, DELETE
ON ALL TABLES IN SCHEMA public
TO te_appuser;

GRANT USAGE, SELECT
ON ALL SEQUENCES IN SCHEMA public
TO te_appuser;
