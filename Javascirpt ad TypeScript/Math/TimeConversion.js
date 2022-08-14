//The Below algorithms convert time units between eachother
/**
 * Converts hours to minutes
 * @param hours hours to be converted to minutes
 * @returns returns amount of minutes in given hour
 */
const hoursToMinutes = (hours) => {
    return hours * 60;
};
/**
 * Converts minutes to seconds
 * @param {*} minutes minutes to be converted to seconds
 * @returns returns amount of seconds in given minutes
 */
const minutesToSeconds = (minutes) => {
    return minutes * 60;
};
/**
 * Converts seconds to minutes
 * @param {*} seconds seconds to be converted to minutes
 * @return returns the amount of minutes in the given seconds
 */
const secondsToMinutes = (seconds) => {
    return seconds / 60;
};
/**
 * Converts seconds to miliseconds
 * @param seconds seconds to be converted to miliseconds
 * @returns returns amount of miliseconds in given seconds
 */
const secondsToMiliseconds = (seconds) => {
    return seconds * 1000;
};
