import axios from 'axios';

let CONFERENCE_API_URL = 'http://localhost:8089/CONFERENCE-SERVICE';

const conferenceApi = axios.create({
  baseURL: CONFERENCE_API_URL,
});

export { conferenceApi };
