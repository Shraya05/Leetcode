select machine_id , round( sum(if(activity_type='start', -timestamp, timestamp)) / count(distinct process_id)  ,3) as processing_time from activity group by machine_id;
